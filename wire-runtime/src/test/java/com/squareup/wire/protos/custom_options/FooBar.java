// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/custom_options.proto at 23:1
package com.squareup.wire.protos.custom_options;

import com.google.protobuf.EnumOptions;
import com.google.protobuf.FieldOptions;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class FooBar extends Message<FooBar> {
  public static final ProtoAdapter<FooBar> ADAPTER = ProtoAdapter.forMessage(FooBar.class);

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_FOO = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_one, 17)
      .build();

  public static final FieldOptions FIELD_OPTIONS_BAR = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_two, 33.5f)
      .build();

  public static final FieldOptions FIELD_OPTIONS_BAZ = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_three, FooBarBazEnum.BAR)
      .build();

  public static final FieldOptions FIELD_OPTIONS_QUX = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_one, 18)
      .setExtension(Ext_custom_options.my_field_option_two, 34.5f)
      .build();

  public static final FieldOptions FIELD_OPTIONS_FRED = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_four, new FooBar.Builder()
          .foo(11)
          .bar("22")
          .baz(new Nested.Builder()
              .value(FooBarBazEnum.BAR)
              .build())
          .fred(Arrays.asList(
              444.0f,
              555.0f))
          .nested(Arrays.asList(
              new FooBar.Builder()
                  .foo(33)
                  .fred(Arrays.asList(
                      100.0f,
                      200.0f))
                  .build()))
          .build())
      .setExtension(Ext_custom_options.my_field_option_two, 99.9f)
      .build();

  public static final FieldOptions FIELD_OPTIONS_DAISY = new FieldOptions.Builder()
      .setExtension(Ext_custom_options.my_field_option_four, new FooBar.Builder()
          .baz(new Nested.Builder()
              .value(FooBarBazEnum.FOO)
              .build())
          .build())
      .build();

  public static final Integer DEFAULT_FOO = 0;

  public static final String DEFAULT_BAR = "";

  public static final Long DEFAULT_QUX = 0L;

  public static final Double DEFAULT_DAISY = 0.0d;

  @WireField(
      tag = 1,
      type = "int32"
  )
  public final Integer foo;

  @WireField(
      tag = 2,
      type = "string"
  )
  public final String bar;

  @WireField(
      tag = 3,
      type = "squareup.protos.custom_options.FooBar.Nested"
  )
  public final Nested baz;

  @WireField(
      tag = 4,
      type = "uint64"
  )
  public final Long qux;

  @WireField(
      tag = 5,
      type = "float",
      label = Message.Label.REPEATED
  )
  public final List<Float> fred;

  @WireField(
      tag = 6,
      type = "double"
  )
  public final Double daisy;

  @WireField(
      tag = 7,
      type = "squareup.protos.custom_options.FooBar",
      label = Message.Label.REPEATED
  )
  public final List<FooBar> nested;

  public FooBar(Integer foo, String bar, Nested baz, Long qux, List<Float> fred, Double daisy, List<FooBar> nested) {
    this.foo = foo;
    this.bar = bar;
    this.baz = baz;
    this.qux = qux;
    this.fred = immutableCopyOf(fred);
    this.daisy = daisy;
    this.nested = immutableCopyOf(nested);
  }

  private FooBar(Builder builder) {
    this(builder.foo, builder.bar, builder.baz, builder.qux, builder.fred, builder.daisy, builder.nested);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FooBar)) return false;
    FooBar o = (FooBar) other;
    if (!extensionsEqual(o)) return false;
    return equals(foo, o.foo)
        && equals(bar, o.bar)
        && equals(baz, o.baz)
        && equals(qux, o.qux)
        && equals(fred, o.fred)
        && equals(daisy, o.daisy)
        && equals(nested, o.nested);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (foo != null ? foo.hashCode() : 0);
      result = result * 37 + (bar != null ? bar.hashCode() : 0);
      result = result * 37 + (baz != null ? baz.hashCode() : 0);
      result = result * 37 + (qux != null ? qux.hashCode() : 0);
      result = result * 37 + (fred != null ? fred.hashCode() : 1);
      result = result * 37 + (daisy != null ? daisy.hashCode() : 0);
      result = result * 37 + (nested != null ? nested.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<FooBar, Builder> {
    public Integer foo;

    public String bar;

    public Nested baz;

    public Long qux;

    public List<Float> fred = Collections.emptyList();

    public Double daisy;

    public List<FooBar> nested = Collections.emptyList();

    public Builder() {
    }

    public Builder(FooBar message) {
      super(message);
      if (message == null) return;
      this.foo = message.foo;
      this.bar = message.bar;
      this.baz = message.baz;
      this.qux = message.qux;
      this.fred = copyOf(message.fred);
      this.daisy = message.daisy;
      this.nested = copyOf(message.nested);
    }

    public Builder foo(Integer foo) {
      this.foo = foo;
      return this;
    }

    public Builder bar(String bar) {
      this.bar = bar;
      return this;
    }

    public Builder baz(Nested baz) {
      this.baz = baz;
      return this;
    }

    public Builder qux(Long qux) {
      this.qux = qux;
      return this;
    }

    public Builder fred(List<Float> fred) {
      this.fred = canonicalizeList(fred);
      return this;
    }

    public Builder daisy(Double daisy) {
      this.daisy = daisy;
      return this;
    }

    public Builder nested(List<FooBar> nested) {
      this.nested = canonicalizeList(nested);
      return this;
    }

    @Override
    public FooBar build() {
      return new FooBar(this);
    }
  }

  public static final class Nested extends Message<Nested> {
    public static final ProtoAdapter<Nested> ADAPTER = ProtoAdapter.forMessage(Nested.class);

    private static final long serialVersionUID = 0L;

    public static final FooBarBazEnum DEFAULT_VALUE = FooBarBazEnum.FOO;

    @WireField(
        tag = 1,
        type = "squareup.protos.custom_options.FooBar.FooBarBazEnum"
    )
    public final FooBarBazEnum value;

    public Nested(FooBarBazEnum value) {
      this.value = value;
    }

    private Nested(Builder builder) {
      this(builder.value);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Nested)) return false;
      return equals(value, ((Nested) other).value);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = value != null ? value.hashCode() : 0);
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<Nested, Builder> {
      public FooBarBazEnum value;

      public Builder() {
      }

      public Builder(Nested message) {
        super(message);
        if (message == null) return;
        this.value = message.value;
      }

      public Builder value(FooBarBazEnum value) {
        this.value = value;
        return this;
      }

      @Override
      public Nested build() {
        return new Nested(this);
      }
    }
  }

  public static final class More extends Message<More> {
    public static final ProtoAdapter<More> ADAPTER = ProtoAdapter.forMessage(More.class);

    private static final long serialVersionUID = 0L;

    @WireField(
        tag = 1,
        type = "int32",
        label = Message.Label.REPEATED
    )
    public final List<Integer> serial;

    public More(List<Integer> serial) {
      this.serial = immutableCopyOf(serial);
    }

    private More(Builder builder) {
      this(builder.serial);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof More)) return false;
      return equals(serial, ((More) other).serial);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = serial != null ? serial.hashCode() : 1);
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<More, Builder> {
      public List<Integer> serial = Collections.emptyList();

      public Builder() {
      }

      public Builder(More message) {
        super(message);
        if (message == null) return;
        this.serial = copyOf(message.serial);
      }

      public Builder serial(List<Integer> serial) {
        this.serial = canonicalizeList(serial);
        return this;
      }

      @Override
      public More build() {
        return new More(this);
      }
    }
  }

  public enum FooBarBazEnum implements WireEnum {
    FOO(1, 17, new More.Builder()
        .serial(Arrays.asList(
            99,
            199))
        .build(), null),

    BAR(2, null, null, true),

    BAZ(3, 18, null, false);

    public static final ProtoAdapter<FooBarBazEnum> ADAPTER = ProtoAdapter.forEnum(FooBarBazEnum.class);

    public static final EnumOptions ENUM_OPTIONS = new EnumOptions.Builder()
        .setExtension(Ext_custom_options.enum_option, true)
        .build();

    private final int value;

    public final Integer enum_value_option;

    public final More complex_enum_value_option;

    public final Boolean foreign_enum_value_option;

    FooBarBazEnum(int value, Integer enum_value_option, More complex_enum_value_option, Boolean foreign_enum_value_option) {
      this.value = value;
      this.enum_value_option = enum_value_option;
      this.complex_enum_value_option = complex_enum_value_option;
      this.foreign_enum_value_option = foreign_enum_value_option;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
