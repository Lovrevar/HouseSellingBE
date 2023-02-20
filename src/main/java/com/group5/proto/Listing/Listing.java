// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Listing.proto

package com.group5.proto.Listing;

public final class Listing {
  private Listing() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_CreateHouseListingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_CreateHouseListingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_IdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_IdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_HouseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_HouseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_ListingFiltersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_ShortListingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_ShortListingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_EmailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_EmailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_AddressMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_AddressMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_ImageFileMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_ImageFileMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_proto_Listing_IsOk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_proto_Listing_IsOk_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rListing.proto\022\030com.group5.proto.Listin" +
      "g\"\266\002\n\031CreateHouseListingRequest\0229\n\007addre" +
      "ss\030\001 \001(\0132(.com.group5.proto.Listing.Addr" +
      "essMessage\022\030\n\020constructionYear\030\002 \001(\005\022\023\n\013" +
      "lastRebuilt\030\003 \001(\005\022\025\n\rhasInspection\030\004 \001(\010" +
      "\022\022\n\ngroundArea\030\005 \001(\001\022\021\n\tfloorArea\030\006 \001(\001\022" +
      ":\n\006images\030\007 \003(\0132*.com.group5.proto.Listi" +
      "ng.ImageFileMessage\022\r\n\005price\030\010 \001(\001\022\021\n\tus" +
      "erEmail\030\t \001(\t\022\023\n\013description\030\n \001(\t\"\027\n\tId" +
      "Request\022\n\n\002Id\030\001 \001(\003\"\314\002\n\rHouseResponse\022\n\n" +
      "\002id\030\001 \001(\003\0229\n\007address\030\002 \001(\0132(.com.group5." +
      "proto.Listing.AddressMessage\022\030\n\020construc" +
      "tionYear\030\003 \001(\005\022\023\n\013lastRebuilt\030\004 \001(\005\022\025\n\rh" +
      "asInspection\030\005 \001(\010\022\022\n\ngroundArea\030\006 \001(\001\022\021" +
      "\n\tfloorArea\030\007 \001(\001\022:\n\006images\030\010 \003(\0132*.com." +
      "group5.proto.Listing.ImageFileMessage\022\r\n" +
      "\005price\030\t \001(\001\022\021\n\tuserEmail\030\n \001(\t\022\024\n\014creat" +
      "ionDate\030\014 \001(\t\022\023\n\013description\030\r \001(\t\"y\n\025Li" +
      "stingFiltersRequest\022\021\n\004city\030\001 \001(\tH\000\210\001\001\022\025" +
      "\n\010maxPrice\030\002 \001(\003H\001\210\001\001\022\024\n\007minArea\030\003 \001(\003H\002" +
      "\210\001\001B\007\n\005_cityB\013\n\t_maxPriceB\n\n\010_minArea\"\247\001" +
      "\n\024ShortListingResponse\022\r\n\005price\030\001 \001(\003\0229\n" +
      "\005image\030\002 \001(\0132*.com.group5.proto.Listing." +
      "ImageFileMessage\0229\n\007address\030\003 \001(\0132(.com." +
      "group5.proto.Listing.AddressMessage\022\n\n\002i" +
      "d\030\004 \001(\003\"\035\n\014EmailRequest\022\r\n\005email\030\001 \001(\t\"S" +
      "\n\016AddressMessage\022\016\n\006street\030\001 \001(\t\022\022\n\npost" +
      "Number\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\022\017\n\007houseNo\030\004 " +
      "\001(\005\"\\\n\020ImageFileMessage\022\027\n\017imageBase64Da" +
      "ta\030\001 \001(\t\022\030\n\020imageContentType\030\002 \001(\t\022\025\n\rim" +
      "ageFileName\030\003 \001(\t\"\024\n\004IsOk\022\014\n\004isOk\030\001 \001(\0102" +
      "\254\004\n\016ListingService\022m\n\rcreateListing\0223.co" +
      "m.group5.proto.Listing.CreateHouseListin" +
      "gRequest\032\'.com.group5.proto.Listing.Hous" +
      "eResponse\022^\n\016getListingById\022#.com.group5" +
      ".proto.Listing.IdRequest\032\'.com.group5.pr" +
      "oto.Listing.HouseResponse\022x\n\023getFiltered" +
      "Listings\022/.com.group5.proto.Listing.List" +
      "ingFiltersRequest\032..com.group5.proto.Lis" +
      "ting.ShortListingResponse0\001\022a\n\rupdateLis" +
      "ting\022\'.com.group5.proto.Listing.HouseRes" +
      "ponse\032\'.com.group5.proto.Listing.HouseRe" +
      "sponse\022n\n\022getListingsByEmail\022&.com.group" +
      "5.proto.Listing.EmailRequest\032..com.group" +
      "5.proto.Listing.ShortListingResponse0\001B\002" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_group5_proto_Listing_CreateHouseListingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_group5_proto_Listing_CreateHouseListingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_CreateHouseListingRequest_descriptor,
        new String[] { "Address", "ConstructionYear", "LastRebuilt", "HasInspection", "GroundArea", "FloorArea", "Images", "Price", "UserEmail", "Description", });
    internal_static_com_group5_proto_Listing_IdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_group5_proto_Listing_IdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_IdRequest_descriptor,
        new String[] { "Id", });
    internal_static_com_group5_proto_Listing_HouseResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_group5_proto_Listing_HouseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_HouseResponse_descriptor,
        new String[] { "Id", "Address", "ConstructionYear", "LastRebuilt", "HasInspection", "GroundArea", "FloorArea", "Images", "Price", "UserEmail", "CreationDate", "Description", });
    internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_group5_proto_Listing_ListingFiltersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor,
        new String[] { "City", "MaxPrice", "MinArea", "City", "MaxPrice", "MinArea", });
    internal_static_com_group5_proto_Listing_ShortListingResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_group5_proto_Listing_ShortListingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_ShortListingResponse_descriptor,
        new String[] { "Price", "Image", "Address", "Id", });
    internal_static_com_group5_proto_Listing_EmailRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_group5_proto_Listing_EmailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_EmailRequest_descriptor,
        new String[] { "Email", });
    internal_static_com_group5_proto_Listing_AddressMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_group5_proto_Listing_AddressMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_AddressMessage_descriptor,
        new String[] { "Street", "PostNumber", "City", "HouseNo", });
    internal_static_com_group5_proto_Listing_ImageFileMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_group5_proto_Listing_ImageFileMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_ImageFileMessage_descriptor,
        new String[] { "ImageBase64Data", "ImageContentType", "ImageFileName", });
    internal_static_com_group5_proto_Listing_IsOk_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_group5_proto_Listing_IsOk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_proto_Listing_IsOk_descriptor,
        new String[] { "IsOk", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}