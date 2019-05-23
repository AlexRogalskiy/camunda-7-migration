package org.camunda.bpm.extension.migration.plan.step;

import org.camunda.bpm.engine.ProcessEngine;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// Do NOT make @Value since it is mocked in tests.
@ToString
@EqualsAndHashCode
@Builder
@Getter
public class StepExecutionContext {
  private ProcessEngine processEngine;
  private String sourceProcessDefinitionId;
  private String targetProcessDefinitionId;
  private String processInstanceId;
}
