void setup() {
  // put your setup code here, to run once:
  pinMode(2,OUTPUT);
  pinMode(3,OUTPUT);
  pinMode(4,OUTPUT);
  pinMode(5,OUTPUT);
Serial.begin(9600); 
}
int v;
void loop() {
  // put your main code here, to run repeatedly:
v=analogRead(A0);
float prt = v/1023.0*5;
Serial.print(prt);  
Serial.println("v");
if(prt<=2&&prt>=0)
{
digitalWrite(2,HIGH);
digitalWrite(3,LOW);
digitalWrite(4,LOW);

}
else if(prt<=3&&prt>2)
{
digitalWrite(2,LOW);
digitalWrite(4,LOW);
digitalWrite(3,HIGH);
}
else
{
digitalWrite(4,HIGH);
digitalWrite(2,LOW);
digitalWrite(3,LOW);

}
 }
