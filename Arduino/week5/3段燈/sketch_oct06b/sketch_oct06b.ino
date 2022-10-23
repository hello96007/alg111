void setup() {
  // put your setup code here, to run once:
pinMode(2,INPUT);
pinMode(3,OUTPUT);
Serial.begin(9600);
}
int count = 0;
int ptr = 0;
void loop() {
   //
  int value=digitalRead(2);
  //Serial.println(value);
  
  if(value==HIGH&&ptr==0)
  {
   count++;
  // Serial.println(count);
   }
   ptr=value;
   Serial.println(value);


  if(count==1)
   {
    digitalWrite(3,HIGH);
    }
   if(count==2)
   {
    digitalWrite(3,HIGH);
    delay(50);
    digitalWrite(3,LOW);
    delay(50);
   /*for(int i = 0 ;i <1000;i++)
   {
    digitalWrite(3,HIGH);
    delay(500);
    digitalWrite(3,LOW);
    delay(500);
    }*/
   }
   if(count==3)
   {
   digitalWrite(3,LOW);
   count=0;
    }
  
  
  // put your main code here, to run repeatedly:
}
