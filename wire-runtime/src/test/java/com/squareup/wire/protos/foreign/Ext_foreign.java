// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/foreign.proto
package com.squareup.wire.protos.foreign;

import com.google.protobuf.EnumValueOptions;
import com.google.protobuf.MessageOptions;
import com.squareup.wire.Extension;
import java.lang.Boolean;

public final class Ext_foreign {
  public static final Extension<MessageOptions, ForeignMessage> foreign_message_option = Extension
      .messageExtending(ForeignMessage.class, MessageOptions.class)
      .setName("squareup.protos.foreign.foreign_message_option")
      .setTag(50007)
      .buildOptional();

  public static final Extension<EnumValueOptions, Boolean> foreign_enum_value_option = Extension
      .boolExtending(EnumValueOptions.class)
      .setName("squareup.protos.foreign.foreign_enum_value_option")
      .setTag(70002)
      .buildOptional();

  private Ext_foreign() {
  }
}
