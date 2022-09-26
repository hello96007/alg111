void setup() {
  // put your setup code here, to run once:
pinMode(2,INPUT);
pinMode(5,OUTPUT);
Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
int value=digitalRead(2);
Serial.println(value);
if(value==1)
{
  for(int k=0;k<2;k++)
  {
  digitalWrite(5,HIGH);
  delay(200);
  digitalWrite(5,LOW);
  delay(200);
   }  
  }

delay(500);
}
