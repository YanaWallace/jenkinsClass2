package Utils;

import org.json.JSONObject;

public class APIPayloadConstants {

    public static String createEmployeePayload(){
        String createEmployeePayload = "{\n" +
                "  \"emp_firstname\": \"Yaya\",\n" +
                "  \"emp_lastname\": \"Reach\",\n" +
                "  \"emp_middle_name\": \"Babe\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"1999-05-28\",\n" +
                "  \"emp_status\": \"Engineer\",\n" +
                "  \"emp_job_title\": \"QA\"\n" +
                "}";
        return createEmployeePayload;
    }

    public static String createEmployeeJsonPayload(){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname","Yaya");
        obj.put("emp_lastname","Reach");
        obj.put("emp_middle_name","Babe");
        obj.put("emp_gender","F");
        obj.put("emp_birthday","1999-05-28");
        obj.put("emp_status","Engineer");
        obj.put("emp_job_title","QA");
        return obj.toString();
    }

    public static String createEmployeeJsonPayloadDynamic
            (String fn, String ln, String mn, String gender,
             String dob, String status, String jobTitle){
        JSONObject obj = new JSONObject();
        obj.put("emp_firstname", fn);
        obj.put("emp_lastname", ln);
        obj.put("emp_middle_name", mn);
        obj.put("emp_gender", gender);
        obj.put("emp_birthday", dob);
        obj.put("emp_status",status);
        obj.put("emp_job_title",jobTitle);
        return obj.toString();
    }

}
