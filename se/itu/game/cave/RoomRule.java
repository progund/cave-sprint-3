package se.itu.game.cave;

public abstract class RoomRule {

  /* Add two protected instance variables here.
   *
   * One String for the creatureDescription and
   * one Room for the Room this RoomRule applies to.
   */
  

  public RoomRule(Room room, String creatureDescription) {
    /* Save the parameters in the appropriate instance variables */
  }

  public abstract void apply();

  public void changeCreatureDescription(String newDescription) {
    /* Change the creatureDescription here! */
  }
  
  public String creatureDescription() {
    /* Call apply() and return the creatureDescription 
     * here...
     */
    return "";
  }
  
}
