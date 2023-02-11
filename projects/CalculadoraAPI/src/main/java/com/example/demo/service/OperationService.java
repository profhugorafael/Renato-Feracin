package com.example.demo.service;

import com.example.demo.model.dto.input.OperationRequest;
import com.example.demo.model.entity.Operation;
import com.example.demo.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {

    @Autowired
    private OperationRepository operationRepository;
    public List<Operation> getAllOperations() {
        return operationRepository.findAll();
    }

    public Operation register(OperationRequest operationRequest) {
        var operationToSave = toOperation(operationRequest);
        evaluateResult(operationToSave);
        return operationRepository.save(operationToSave);
    }

    private void evaluateResult(Operation operation) {
        switch(operation.getOperationSign()) {
            case "+" -> operation.setResult(operation.getFirstNumber() + operation.getSecondNumber());
            case "-" -> operation.setResult(operation.getFirstNumber() - operation.getSecondNumber());
            case ".", "*" -> operation.setResult(operation.getFirstNumber() * operation.getSecondNumber());
            case "/" -> operation.setResult(operation.getFirstNumber() / operation.getSecondNumber());
        }
    }

    private Operation toOperation(OperationRequest operationRequest) {
        var splitRequest = operationRequest.getFullOperation().split(" ");
        // ["2", "+", "2"]

        return Operation.builder()
                .firstNumber(Double.parseDouble(splitRequest[0]))
                .operationSign(splitRequest[1])
                .secondNumber(Double.parseDouble(splitRequest[2]))
                .build();
    }

}
