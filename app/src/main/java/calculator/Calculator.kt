package calculator

class Calculator {
    private var result :String?=null;
    private var calculationResult:Int = 0;

    fun getReult() : String? {
        return result;
    }
    fun setOne(){
        if (result == null){
            result = "1"
        }
        else {
            result = result.plus("1")
        }
    }
    fun setTwo(){
        if (result == null){
            result = "2"
        }
        else {
            result = result.plus("2")
        }
    }
    fun setThree(){
        if (result == null){
            result = "3"
        }
        else {
            result = result.plus("3")
        }
    }

}