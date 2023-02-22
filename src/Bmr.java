public class Bmr {
    double weight,carb,fat,calorie,kg;
    public Bmr(double weight,double carb, double fat, double calorie){
        this.setWeight(weight);
        this.setCalorie(calorie);
        this.setFat(fat);
        this.setCarb(weight);
        
    }

    public void setWeight(double kg){
        //convert the weight in pound
        this.weight=kg*2.2;
    
    }

    public void setCalorie(double calorie){    
        //multiplay the weight to get the calories 
        this.calorie = weight*12;

    }

    public void setFat(double fat){
        //return his daily need of fat
        this.fat=(calorie*0.25)/9;

    }
    public void setCarb(double carb){
        //return his daily need of carb
        this.carb=(calorie-(weight*4+(fat*9)))/4;
        
    }
    
    public double getCalorie(){
        return this.calorie;
    }

    
    public double getWeight(){
        return this.weight;
    }

    public double getFat(){
        return this.fat;
    }

    public double getCarb(){
        return this.carb;
    }
}
