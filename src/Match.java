public class Match {
    Dovuscu d1;
    Dovuscu d2;
    int minWeight;
    int maxWeight;


    Match(Dovuscu d1,Dovuscu d2,int minWeight,int maxWeight){
        this.d1=d1;
        this.d2=d2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run() {
        if (isCheck()) {
        while (this.d1.health>0 && this.d2.health>0){
            System.out.println("====Yeni Round====");
            this.d2.health = this.d1.hit(d2);
            if (isWin())
                break;

            this.d1.health=this.d2.hit(d1);
            if (isWin()){
                break;
            }
            System.out.println(this.d1.name+"Sağlık : "+this.d1.health);
            System.out.println(this.d2.name+"Sağlık : "+this.d2.health);
        }
        } else {
            System.out.println("sporcuların sikletleri uygun değildir.");
        }
    }

        boolean isCheck() {
            return (this.d1.weight >= minWeight && this.d1.weight <= maxWeight) && (this.d2.weight >= minWeight && this.d2.weight <= maxWeight);

        }
        boolean isWin() {
            if (this.d1.health == 0) {
                System.out.println(d2.name + " kazandı! ");
                return true;
            }
            else if(this.d2.health==0){
                System.out.println(d1.name+" kazandı! ");
                return true;
            }
            else {
                return false;
            }
        }


        }
