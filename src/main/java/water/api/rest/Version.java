package water.api.rest;

/** It is like enum but provide typing */
public abstract class Version {
  private final String name;
  private Version(String name) { this.name = name; }
  @Override public String toString() { return name; }
  public static class V1 extends Version { private V1(){ super("v1"); } }
  public static class V2 extends Version { private V2(){ super("v2"); } }
  public static class V3 extends Version { private V3(){ super("v3"); } }
  public static class Bloody extends Version { private Bloody() { super("bloody"); } }
  public static final V1 v1 = new V1();
  public static final V2 v2 = new V2();
  public static final V3 v3 = new V3();
  public static final Bloody bloody = new Bloody();
}
