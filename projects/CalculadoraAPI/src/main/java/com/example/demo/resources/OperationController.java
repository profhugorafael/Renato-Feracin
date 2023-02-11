package com.example.demo.resources;

import com.example.demo.model.dto.input.OperationRequest;
import com.example.demo.model.dto.output.OperationResponse;
import com.example.demo.model.entity.Operation;
import com.example.demo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.InputMismatchException;
import java.util.List;

@RestController
@RequestMapping("/api/calculator")
public class OperationController {

    @Autowired
    private OperationService operationService;

    @GetMapping
    public List<OperationResponse> getAllOperations() {
        return operationService
                .getAllOperations()
                .stream()
                .map(op -> OperationResponse
                        .builder()
                        .operationSolved(op.getFirstNumber() + " "
                                + op.getOperationSign() + " "
                                + op.getSecondNumber() + " = "
                                + op.getResult())
                        .build()
                ).toList();
    }

    @PostMapping
    public OperationResponse addNewOperation(@RequestBody OperationRequest operationRequest){
        Operation operationSaved = operationService.register(operationRequest);
        return OperationResponse.builder()
        .operationSolved(
            operationSaved.getFirstNumber() + " "
            + operationSaved.getOperationSign() + " "
            + operationSaved.getSecondNumber() + " = "
            + operationSaved.getResult()
        ).build();
    }

    // @ExceptionHandler(InputMismatchException.class)

}
