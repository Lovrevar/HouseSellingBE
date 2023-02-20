// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Listing.proto

package com.group5.proto.Listing;

public interface HouseResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.group5.proto.Listing.HouseResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.com.group5.proto.Listing.AddressMessage address = 2;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.com.group5.proto.Listing.AddressMessage address = 2;</code>
   * @return The address.
   */
  AddressMessage getAddress();
  /**
   * <code>.com.group5.proto.Listing.AddressMessage address = 2;</code>
   */
  AddressMessageOrBuilder getAddressOrBuilder();

  /**
   * <code>int32 constructionYear = 3;</code>
   * @return The constructionYear.
   */
  int getConstructionYear();

  /**
   * <code>int32 lastRebuilt = 4;</code>
   * @return The lastRebuilt.
   */
  int getLastRebuilt();

  /**
   * <code>bool hasInspection = 5;</code>
   * @return The hasInspection.
   */
  boolean getHasInspection();

  /**
   * <code>double groundArea = 6;</code>
   * @return The groundArea.
   */
  double getGroundArea();

  /**
   * <code>double floorArea = 7;</code>
   * @return The floorArea.
   */
  double getFloorArea();

  /**
   * <code>repeated .com.group5.proto.Listing.ImageFileMessage images = 8;</code>
   */
  java.util.List<ImageFileMessage>
      getImagesList();
  /**
   * <code>repeated .com.group5.proto.Listing.ImageFileMessage images = 8;</code>
   */
  ImageFileMessage getImages(int index);
  /**
   * <code>repeated .com.group5.proto.Listing.ImageFileMessage images = 8;</code>
   */
  int getImagesCount();
  /**
   * <code>repeated .com.group5.proto.Listing.ImageFileMessage images = 8;</code>
   */
  java.util.List<? extends ImageFileMessageOrBuilder>
      getImagesOrBuilderList();
  /**
   * <code>repeated .com.group5.proto.Listing.ImageFileMessage images = 8;</code>
   */
  ImageFileMessageOrBuilder getImagesOrBuilder(
      int index);

  /**
   * <code>double price = 9;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>string userEmail = 10;</code>
   * @return The userEmail.
   */
  String getUserEmail();
  /**
   * <code>string userEmail = 10;</code>
   * @return The bytes for userEmail.
   */
  com.google.protobuf.ByteString
      getUserEmailBytes();

  /**
   * <code>string creationDate = 12;</code>
   * @return The creationDate.
   */
  String getCreationDate();
  /**
   * <code>string creationDate = 12;</code>
   * @return The bytes for creationDate.
   */
  com.google.protobuf.ByteString
      getCreationDateBytes();

  /**
   * <code>string description = 13;</code>
   * @return The description.
   */
  String getDescription();
  /**
   * <code>string description = 13;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}