package test.domain;

public class PersonInfoWithBLOBs extends PersonInfo {
    private String fieldData;

    private String formDefaultValue;

    public String getFieldData() {
        return fieldData;
    }

    public void setFieldData(String fieldData) {
        this.fieldData = fieldData == null ? null : fieldData.trim();
    }

    public String getFormDefaultValue() {
        return formDefaultValue;
    }

    public void setFormDefaultValue(String formDefaultValue) {
        this.formDefaultValue = formDefaultValue == null ? null : formDefaultValue.trim();
    }
}