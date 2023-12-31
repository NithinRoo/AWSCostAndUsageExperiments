import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rough {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<String, String>() {{
            put("drn:roo:supportable:xx:dc290c2a-3285-448b-b3c1-27bf2345fa94","production");
            put("drn:roo:supportable:xx:2362cbb1-3aac-490d-b092-ce0122d7054d","production");
            put("drn:roo:supportable:xx:c68476d9-4a1a-401c-8fef-d8d1b1d12ae0","production");
            put("drn:roo:supportable:xx:71d90d1f-2586-49de-b910-c7a9f13f6e5c","production");
            put("drn:roo:supportable:xx:33efcde7-826f-4988-9318-7553f2e82c12","production");
            put("drn:roo:supportable:xx:1e01693d-5f2d-45bd-b924-01bdf49d3888","production");
            put("drn:roo:supportable:xx:12753f8c-cd28-48fc-852d-1da6ada7ea0e","production");
            put("drn:roo:supportable:xx:5a42095e-91cc-40f8-9555-bfb88784316b","production");
            put("drn:roo:supportable:xx:7a149453-0a33-4e26-a812-707bb2feee22","production");
            put("drn:roo:supportable:xx:c3752034-c10d-428b-8457-78164b800d42","production");
            put("drn:roo:supportable:xx:9c244950-6270-4a96-98b1-e1475ba85432","production");
            put("drn:roo:supportable:xx:f9cb217c-21e2-42cf-a18a-d941e2c7936d","production");
            put("drn:roo:supportable:xx:1e1f6459-8ca1-44f9-818e-c6fc1c79c734","production");
            put("drn:roo:supportable:xx:c060f758-7379-4f13-b262-2a80a57fab6b","production");
            put("drn:roo:supportable:xx:4e87d8b5-493c-4a2a-b3f0-1d8a731b498a","production");
            put("drn:roo:supportable:xx:65d8660f-0bf9-4cad-87dd-0430291ef6fd","production");
            put("drn:roo:supportable:xx:bc73f89a-c97d-4dca-a26e-631cdba27dcf","production");
            put("drn:roo:supportable:xx:38a8fe2d-5bb8-4e79-9bcc-6e0c5b8babe8","production");
            put("drn:roo:supportable:xx:16afe11b-831b-4486-ad9b-79389f785119","production");
            put("drn:roo:supportable:xx:d0d25f8e-bec4-421c-9491-f7fdfe9fac41","production");
            put("drn:roo:supportable:xx:c449878f-d2f4-4b06-9edc-27de49cf583c","production");
            put("drn:roo:supportable:xx:6fb08b45-9bd6-4516-8581-b289381dce6f","production");
            put("drn:roo:supportable:xx:42011e3c-d63a-4c90-afbf-d86c491eb117","staging");
            put("drn:roo:supportable:xx:e119ca1d-04ef-4a63-b3bc-143b67611d02","production");
            put("drn:roo:supportable:xx:6cc5a8d0-da3d-4213-b2fd-247b71cec56d","production");
            put("drn:roo:supportable:xx:f6da5756-9dc6-4f67-9777-bccf6a6aa7b2","production");
            put("drn:roo:supportable:xx:3ddf3461-2823-4df6-8468-7b9c489fe651","production");
            put("drn:roo:supportable:xx:f0305de7-7835-4c26-8d13-9f3cd130bf39","production");
            put("drn:roo:supportable:xx:e56955ef-6b4e-4a1f-b64c-8e7c9d266b69","staging");
            put("drn:roo:supportable:xx:f0bd011c-7f8f-4b9b-9918-16eeed384f5a","production");
            put("drn:roo:supportable:xx:b8cdb91c-c9e2-4dcb-939f-d999100b5b2e","production");
            put("drn:roo:supportable:xx:132ae48e-1c52-4310-bb03-46590fd6d941","production");
            put("drn:roo:supportable:xx:ce6a406d-e894-496a-8907-4858214db91d","production");
            put("drn:roo:supportable:xx:cfda4cb1-933b-477c-aa8d-f8b88a404dab","production");
            put("drn:roo:supportable:xx:31e6f725-2146-4308-9fd6-74d8b7320bb2","staging");
            put("drn:roo:supportable:xx:eb2e457a-de54-4c51-bc1d-45f79ecd4aa0","production");
            put("drn:roo:supportable:xx:c3521cef-6e89-4aaf-a3c0-2fbdc6de4eab","production");
            put("drn:roo:supportable:xx:4b9ec127-dbcb-4b96-9241-fc17fe0dea6f","staging");
            put("drn:roo:supportable:xx:729e8429-b1bd-4080-80c1-27d97d5df436","production");
            put("drn:roo:supportable:xx:d5216fb2-5038-4144-8cbd-3279e56f4024","production");
            put("drn:roo:supportable:xx:fb9cdb54-076a-49e2-8f77-cbcdf30a83dd","production");
            put("drn:roo:supportable:xx:a4a3843c-dd5a-4583-8f79-79bc981642d3","staging");
            put("drn:roo:supportable:xx:6f96ccbf-8ec2-4fe0-bd75-884f7c51d03d","production");
            put("drn:roo:supportable:xx:ea6d1602-f28e-4863-93ae-6f9cdc4986b5","production");
            put("drn:roo:supportable:xx:d444edce-d3d6-4dc0-9abf-8ae5d09fc3a1","production");
            put("drn:roo:supportable:xx:5b957653-ff0b-4bc3-bad1-2b5eb43d94ec","production");
            put("drn:roo:supportable:xx:10fe1a81-9e3d-4896-8503-4a21de144b95","production");
            put("drn:roo:supportable:xx:fc21eb14-1add-4d38-9ed1-05bdb812eae5","staging");
            put("drn:roo:supportable:xx:59ce79f1-f42d-4b71-b720-40ff22681ca8","production");
            put("drn:roo:supportable:xx:335c73da-a488-49b3-a7b3-4c00053934a3","production");
            put("drn:roo:supportable:xx:b6966658-0e85-4e48-9b7d-e872734d1224","production");
            put("drn:roo:supportable:xx:d0d2112e-fb89-4a8b-a1a1-a4260ec4eb02","production");
            put("drn:roo:supportable:xx:5c63867e-ccbc-479a-82c3-a0bd2704bee1","production");
            put("drn:roo:supportable:xx:b7f110fb-8e52-45f4-aa33-875f63541b49","production");
            put("drn:roo:supportable:xx:11cab8e4-39fc-4c1a-ac7b-cc750cfd87a2","staging");
            put("drn:roo:supportable:xx:255cf450-c59d-4cfd-8c11-a990afa94e72","production");
            put("drn:roo:supportable:xx:846d5abd-c999-4474-bbc2-7c04959bc80b","production");
            put("drn:roo:supportable:xx:3ca3920d-e0f6-47e4-b3ed-c481fd543800","production");
            put("drn:roo:supportable:xx:30172138-6d08-4ad2-9f22-28e1644fc9ca","production");
            put("drn:roo:supportable:xx:91beaaa4-a8f5-4c56-89bf-60edac482547","production");
            put("drn:roo:supportable:xx:10a3163a-116e-472a-9b22-35f5ac211628","staging");
            put("drn:roo:supportable:xx:3ec52586-8d32-4c1d-9f8f-ada051dac77a","production");
            put("drn:roo:supportable:xx:91af7772-10ab-4d01-8ede-6f2bb6db7b0b","staging");
            put("drn:roo:supportable:xx:1cb06727-bb1d-4da4-9d01-9e645f47c858","production");
            put("drn:roo:supportable:xx:e06e2430-beed-40c1-849f-733bb1bcf614","production");
            put("drn:roo:supportable:xx:2a9147b4-b121-4825-9ae8-1709c9898ca3","production");
            put("drn:roo:supportable:xx:b203e110-1b2b-454a-b087-736c5b53ded6","production");
            put("drn:roo:supportable:xx:814f6164-d324-4a28-b9ea-a8babee4654f","production");
            put("drn:roo:supportable:xx:20983389-5d84-43fa-adb2-6cb7e82d5451","staging");
            put("drn:roo:supportable:xx:26e5342e-472b-4bab-9479-0bf44186a9df","staging");
            put("drn:roo:supportable:xx:17bdffc9-a4de-447a-a255-9858e7778df2","production");
            put("drn:roo:supportable:xx:c618373c-9262-4979-b941-01f0ae77decf","staging");
            put("drn:roo:supportable:xx:21f3e44d-9f9d-4696-9ca0-aee04c2c7f99","production");
            put("drn:roo:supportable:xx:0ba0d5b5-52d4-473d-b204-b993632d3881","production");
            put("drn:roo:supportable:xx:7d0fdd92-03f1-4e44-9178-016bfcffaf63","staging");
            put("drn:roo:supportable:xx:a1374e0a-6d1c-495d-b39d-61940003069f","production");
            put("drn:roo:supportable:xx:8b7b8cf0-dab8-41eb-a85a-8808d604a181","production");
            put("drn:roo:supportable:xx:ea4528f7-5f07-4f5a-9de1-db6f7fc83af2","production");
            put("drn:roo:supportable:xx:e71bd8a2-bb9e-48eb-a7a7-f810e1ca28fc","staging");
            put("drn:roo:supportable:xx:7c8f2741-b40e-4527-af18-105ab298f1bf","production");
            put("drn:roo:supportable:xx:8a6b0df0-39bf-40b5-bb8c-193f5b93315f","staging");
            put("drn:roo:supportable:xx:23f6ac60-d832-4ae8-8873-c39ea92847da","staging");
            put("drn:roo:supportable:xx:0f07d68b-7c2d-488f-bdbf-871cc8074de0","production");
            put("drn:roo:supportable:xx:b13567f9-b949-4b86-aa10-5586e4f3a661","staging");
            put("drn:roo:supportable:xx:c32ec432-d68f-4b01-809f-248245db40c3","production");
            put("drn:roo:supportable:xx:8ca999c5-46bf-404a-9870-a77f0599d39e","production");
            put("drn:roo:supportable:xx:5dccbd3c-7610-4cdf-90b9-749d2a9a0c38","production");
            put("drn:roo:supportable:xx:0ca4d487-fe4b-4e29-b2fd-4c4b101041e6","production");
            put("drn:roo:supportable:xx:ef34846d-4da6-4cb2-83c1-891c438e172a","production");
            put("drn:roo:supportable:xx:fec93b39-9c76-4a71-9084-8df7042b5e46","staging");
            put("drn:roo:supportable:xx:57e1b7d6-c6e7-4309-8cf9-f965bfab279e","production");
            put("drn:roo:supportable:xx:8f8e7a8e-3eee-4cc5-a1b4-43ee821517df","production");
            put("drn:roo:supportable:xx:41897679-4441-441e-aa66-33a37d4cff1c","production");
            put("drn:roo:supportable:xx:62411ab9-ddac-48f3-a873-440593b1ace2","production");
            put("drn:roo:supportable:xx:622512f0-0896-41d1-bd86-b0777e364332","staging");
            put("drn:roo:supportable:xx:303cbd31-239f-4bb8-af8a-94d4b3ad9dc3","staging");
            put("drn:roo:supportable:xx:5a2e7e83-45d7-4655-931c-39f67442829d","production");
            put("drn:roo:supportable:xx:d45cbc48-f3a6-4e33-8052-003fa96ce710","production");
            put("drn:roo:supportable:xx:70a9aad4-b07c-495d-a160-e1fb3f0891eb","production");
            put("drn:roo:supportable:xx:729b38e7-3dba-48fb-be1e-cecbe53ce2d0","production");
            put("drn:roo:supportable:xx:be610d6a-1ff1-47e1-88e7-0ff6efce8c16","staging");
            put("drn:roo:supportable:xx:932c4666-f147-40d9-8921-d8c7eca3dac9","production");
            put("drn:roo:supportable:xx:e03c250c-188d-4607-a728-a50a7fa7c2e9","staging");
            put("drn:roo:supportable:xx:a88a736b-dd3b-4e13-a33d-58fb240bd9a9","production");
            put("drn:roo:supportable:xx:7aebec8c-4331-41d6-86a9-54d434731ad8","production");
            put("drn:roo:supportable:xx:852c3cee-1b88-4cd6-be79-e2c64bd33554","production");
            put("drn:roo:supportable:xx:19870881-e769-4f19-98f4-24f5ff129d30","staging");
            put("drn:roo:supportable:xx:8e2c54cb-b806-452e-9081-e97aa9f508a8","production");
            put("drn:roo:supportable:xx:aa6cbc02-e154-40e6-bf0b-70f3e8ef6f6e","staging");
            put("drn:roo:supportable:xx:df2593a9-ab95-4315-a532-b25a12898a66","staging");
            put("drn:roo:supportable:xx:521b48a5-b767-4716-8188-2d904016953b","staging");
            put("drn:roo:supportable:xx:c67e1b16-1f64-4abe-8b19-f8209a97f94f","production");
            put("drn:roo:supportable:xx:55b5c60b-9b85-4b82-8626-2ba71df16c79","staging");
            put("drn:roo:supportable:xx:38a8a5aa-09ce-42f8-a5af-d6ed9c54521a","production");
            put("drn:roo:supportable:xx:903c1092-2588-4851-8605-5d7d881b33d6","staging");
            put("drn:roo:supportable:xx:c99fc6f8-1171-45b9-8382-6a53b7e31080","staging");
            put("drn:roo:supportable:xx:749be4a5-f98b-44e8-97d8-3330f2ed9d68","production");
            put("drn:roo:supportable:xx:6d742188-41a5-49b7-b0f0-e28cb781eb99","staging");
            put("drn:roo:supportable:xx:ab2f1865-b712-4b97-bb3c-3b742f80b27b","production");
            put("drn:roo:supportable:xx:a845a50c-21ad-4bfc-a5d4-846cf3ca6378","production");
            put("drn:roo:supportable:xx:a935e29d-b3b1-491d-849f-e100d8351241","staging");
            put("drn:roo:supportable:xx:b472a24f-2b20-4abe-9ea7-a30b2b531e91","production");
            put("drn:roo:supportable:xx:8a649e10-b0cc-4d2b-8263-6b1a93023345","staging");
            put("drn:roo:supportable:xx:79036f29-cb15-45d0-a213-b7ba3eb3b55c","staging");
            put("drn:roo:supportable:xx:55e8584f-0af3-47e6-bb24-2e3d48450712","staging");
            put("drn:roo:supportable:xx:cec0a14c-c240-4b89-a7d0-44340788e217","production");
            put("drn:roo:supportable:xx:8d9f2248-be58-4c3e-83ab-739a11db0943","production");
            put("drn:roo:supportable:xx:b171e32a-f795-4794-b72d-dc372f8f843a","staging");
            put("drn:roo:supportable:xx:c61872d7-ed4b-4977-bca2-6994094e8e16","staging");
            put("drn:roo:supportable:xx:6ef7be44-a4db-44ca-8e90-a7f45acdcfaf","staging");
            put("drn:roo:supportable:xx:705f02ee-ea3d-471b-b6d3-39ea64d36778","staging");
            put("drn:roo:supportable:xx:762ebac9-c122-4bef-b374-cae4a58a9c20","staging");
            put("drn:roo:supportable:xx:e3b5e65b-167a-408e-8e19-5f55781ff33d","production");
            put("drn:roo:supportable:xx:fe5991ff-c672-4165-979a-d5381808eba3","staging");
            put("drn:roo:supportable:xx:71c99a7a-31ce-45d9-82c1-b46a39e85594","staging");
            put("drn:roo:supportable:xx:a71cd130-4dfe-4ab6-a54e-baeb56bafcff","production");
            put("drn:roo:supportable:xx:2ab1cdbe-480c-487a-a5de-4ac2e5ba20e9","production");
            put("drn:roo:supportable:xx:3c2e947b-3026-47fc-a136-90e9ab698249","production");
            put("drn:roo:supportable:xx:71e20d46-34f7-4ad4-990d-2163dd38a62f","staging");
            put("drn:roo:supportable:xx:49851d01-dd63-420b-87de-2bb4019bf437","staging");
            put("drn:roo:supportable:xx:2ecec294-01ff-4c45-9d81-8e848e77c3d3","staging");
            put("drn:roo:supportable:xx:765aafbc-9d3a-4bd5-a580-b42f077fe831","staging");
            put("drn:roo:supportable:xx:142994a8-7ad0-408d-a9de-22b427f9efad","production");
            put("drn:roo:supportable:xx:cde1addd-e918-421c-90f0-8136950472ab","production");
            put("drn:roo:supportable:xx:4dc45078-1085-41a3-a1a6-640d63b7414b","production");
            put("drn:roo:supportable:xx:ee93e762-070d-4689-ab89-9933ce638587","production");
            put("drn:roo:supportable:xx:bb1c088c-7fa8-4b19-a19f-8a29adb03a2d","production");
            put("drn:roo:supportable:xx:8e35ddee-c598-4557-860a-2c9463f6bd28","staging");
            put("drn:roo:supportable:xx:d2e7bb70-4837-4b95-822a-31746b1aca83","production");
            put("drn:roo:supportable:xx:60b28405-ec0a-4168-b62e-26d8a4332ba5","staging");
            put("drn:roo:supportable:xx:7f188776-b421-4332-8975-4ba16a65b280","production");
            put("drn:roo:supportable:xx:5ed2c6b1-1b5c-4af0-80d2-027e4bf38568","production");
            put("drn:roo:supportable:xx:122619ef-9550-4546-8617-34c13c0f9dd0","production");
            put("drn:roo:supportable:xx:87233bc5-3aec-4175-ab63-588f719a2ae2","staging");
            put("drn:roo:supportable:xx:fbf0cd80-be42-40d1-8451-89765ce41544","production");
            put("drn:roo:supportable:xx:b76fa624-5994-4b11-9607-ba99e483a585","production");
            put("drn:roo:supportable:xx:f64a2aff-357b-4acf-b6c7-b4d8d149fc44","staging");
            put("drn:roo:supportable:xx:28acf419-37ad-464f-9589-b9b73b7df420","staging");
            put("drn:roo:supportable:xx:f0c680cc-3a97-40cb-a4c1-d843f6cd8c70","production");
            put("drn:roo:supportable:xx:8cb8986a-5d1f-4495-a960-85d89486c0b2","production");
            put("drn:roo:supportable:xx:4e007af3-e400-4400-a399-93ee81d3442c","production");
            put("drn:roo:supportable:xx:f7f01b2d-ba49-47fe-b678-391497ba9bbc","staging");
            put("drn:roo:supportable:xx:658c4de1-f4a8-4992-ba56-dfcd6c392900","production");
            put("drn:roo:supportable:xx:c596341a-c3d4-4727-82ef-bf311473cb14","staging");
            put("drn:roo:supportable:xx:012c0903-94a7-43c1-815a-0f6cd93a7bd3","staging");
            put("drn:roo:supportable:xx:e4bed8fa-8bbe-4cf8-b9a7-fbee266ec816","staging");
            put("drn:roo:supportable:xx:2ad6aa82-1867-4250-87c2-ff3961f2a54f","staging");
            put("drn:roo:supportable:xx:39eacbf9-72f1-4988-9f44-836efdbf2fde","production");
            put("drn:roo:supportable:xx:e091e3a2-eb79-4888-a55a-79a1ad442f61","production");
            put("drn:roo:supportable:xx:b6d70cb5-8e80-48b0-887c-f03fd77d30fb","production");
            put("drn:roo:supportable:xx:b563d175-6e9d-4904-87ea-317182eb61f6","production");
            put("drn:roo:supportable:xx:ef4efcd8-b09d-4437-ab96-4839ddf69df5","production");
            put("drn:roo:supportable:xx:de979e3e-e417-400d-b243-d3378e4ab17e","staging");
            put("drn:roo:supportable:xx:a947518e-e4da-40cc-9fa1-5634a36db25f","production");
            put("drn:roo:supportable:xx:2ec36a17-3013-4702-8329-ab541dd11ba4","staging");
            put("drn:roo:supportable:xx:44c1f96e-ac78-42e4-a81d-6f210ca65323","staging");
            put("drn:roo:supportable:xx:86ef5a24-ef61-44f2-ae26-3510d154cdbc","staging");
            put("drn:roo:supportable:xx:86590e81-2bfb-45c1-a08d-d2e5dd574f74","production");
            put("drn:roo:supportable:xx:c0563523-6b54-47d3-a023-a072d32c78c7","staging");
            put("drn:roo:supportable:xx:9a480851-19ab-49a6-aa76-388c4825dced","staging");
            put("drn:roo:supportable:xx:6c37e41f-3907-4a95-8c0e-8e61a025a27d","staging");
            put("drn:roo:supportable:xx:e7a1eff9-af8f-42a0-bd12-ae5a626cdede","staging");
            put("drn:roo:supportable:xx:31a29f9e-cf96-4635-a1b8-4f4b9cd5e15d","production");
            put("drn:roo:supportable:xx:9703d889-f706-4af0-85bc-2af799df6e41","staging");
            put("drn:roo:supportable:xx:674f7fcd-af0c-49c3-91f9-1de7543b2df7","staging");
            put("drn:roo:supportable:xx:041b99ee-e870-4085-bdff-bd8518c351c7","staging");
            put("drn:roo:supportable:xx:2d85ec18-cf2a-4ee5-a63e-f5401b95240b","production");
            put("drn:roo:supportable:xx:acec0061-46f6-4f57-aa79-a27f1da14139","staging");
            put("drn:roo:supportable:xx:bfefbaf4-875a-4399-87b3-97b29ca8b50f","staging");
            put("drn:roo:supportable:xx:398a841a-4db7-40fa-9f1b-eb6d73800c53","staging");
            put("drn:roo:supportable:xx:6a2c9b5a-e9d4-469d-a105-e7595f56d793","staging");
            put("drn:roo:supportable:xx:8ac16638-ca5d-47b1-bf2e-1394d408f131","staging");
            put("drn:roo:supportable:xx:8889f0e9-d0eb-458e-918f-7f5b34697dd2","production");
            put("drn:roo:supportable:xx:440afbe3-7722-4718-9c2f-6da854c19cc9","staging");
            put("drn:roo:supportable:xx:fb07460c-3af2-4055-839e-3c969d032b40","staging");
            put("drn:roo:supportable:xx:70f2377b-e6f1-4909-85a4-7d4592a5c1a3","production");
            put("drn:roo:supportable:xx:29f08b26-6c27-4456-95f0-36415e9068d9","staging");
            put("drn:roo:supportable:xx:9b956e41-841b-4e28-ad37-fb752fdb3b98","staging");
            put("drn:roo:supportable:xx:3058de29-1043-43df-a938-9a0c38ab23d1","production");
            put("drn:roo:supportable:xx:45d94768-20e6-4da4-a401-266a93d0683a","staging");
            put("drn:roo:supportable:xx:6f774931-bc77-4f9d-8818-69978d491a20","staging");
            put("drn:roo:supportable:xx:17f7b7c3-f6b4-4f85-bdf3-075b1dfb4cc5","staging");
            put("drn:roo:supportable:xx:9211e8e1-d3da-453d-9494-3499c198eee1","production");
            put("drn:roo:supportable:xx:5ab320f3-3400-4c80-aa88-bcdfffa05b82","staging");
            put("drn:roo:supportable:xx:c054d8d6-afe4-4e3c-973b-2ba92aeca5ad","production");
            put("drn:roo:supportable:xx:f5bf5ceb-e8f0-4c95-a956-b3ace2dc4134","staging");
            put("drn:roo:supportable:xx:83090a34-445e-4e49-a246-ea2f2b157847","production");
            put("drn:roo:supportable:xx:b07e101f-d749-4339-b771-cf93b2bae3bc","staging");
            put("drn:roo:supportable:xx:cff2dbb5-b0ac-4ceb-a004-97b468ef4c33","staging");
            put("drn:roo:supportable:xx:eea9935b-10e3-4273-aca7-d1a3196993ed","staging");
            put("drn:roo:supportable:xx:f486ac35-7bd1-492d-aa64-fc3d38b59fa7","production");
            put("drn:roo:supportable:xx:18b05205-5c5d-479f-aa22-fddae68653f3","staging");
            put("drn:roo:supportable:xx:469e6a6f-84c5-4bf5-954a-3d5460f7a820","staging");
            put("drn:roo:supportable:xx:f08919b2-477c-4735-840d-0a01894624b7","production");
            put("drn:roo:supportable:xx:3e017c94-0c4b-49d0-b03b-f3f6dad353d6","production");
            put("drn:roo:supportable:xx:68c2f5db-d804-4c3c-98cf-15889f6a767b","production");
            put("drn:roo:supportable:xx:08458a36-4699-4778-99f4-fc4aad52ae7b","production");
            put("drn:roo:supportable:xx:7a4ad5c6-f33d-4821-99de-f3d1355c40d2","staging");
            put("drn:roo:supportable:xx:0e71bfbb-af57-40a2-b7fa-c86e84440b3c","staging");
            put("drn:roo:supportable:xx:7e884237-4e63-4fb3-a7cd-e00e1939b207","staging");
            put("drn:roo:supportable:xx:5fb29da9-0f35-4f37-b0d3-67ffb0492153","production");
            put("drn:roo:supportable:xx:13a71ce8-7ece-4f5d-bbf1-c7d67d4f13fb","production");
            put("drn:roo:supportable:xx:d31add91-30c8-46b9-9070-62cce84953cd","staging");
            put("drn:roo:supportable:xx:42866bfe-6f55-4c3a-a218-a4951ca4f0c0","staging");
            put("drn:roo:supportable:xx:7aa1b88e-5481-4d63-8e4d-2d21d86e8396","staging");
            put("drn:roo:supportable:xx:4204e328-fc40-488e-9d69-0d28c0bbc039","production");
            put("drn:roo:supportable:xx:8d48fc35-58e2-4261-870c-8f19ed1139ef","staging");
            put("drn:roo:supportable:xx:9fcd91c5-645e-4e46-a2c8-39fbe8bbd7ac","staging");
            put("drn:roo:supportable:xx:4c7f6a42-3cf3-499c-af56-114c63949589","production");
            put("drn:roo:supportable:xx:efe506df-dbe3-40a1-b753-a7f96e1c408f","staging");
            put("drn:roo:supportable:xx:0eaecf02-24c1-4fbc-bb0d-d052d1f039a5","staging");
            put("drn:roo:supportable:xx:d0f06f5a-4524-45c4-82a4-3783e28a85e5","staging");
            put("drn:roo:supportable:xx:a962cf2e-e569-44dd-aa11-66bc23d5384a","staging");
            put("drn:roo:supportable:xx:9db83244-6878-4e08-86d5-23970cd09f70","production");
            put("drn:roo:supportable:xx:5bab4dbf-ff36-4630-90da-4099d86c7d6a","production");
            put("drn:roo:supportable:xx:a35dfdd2-4042-4815-bb90-6e8467a5f3aa","production");
            put("drn:roo:supportable:xx:91997b92-c7e9-4271-bbbf-3b825b4405a1","production");
            put("drn:roo:supportable:xx:867835dd-8710-4743-b117-a6535d954874","production");
            put("drn:roo:supportable:xx:7535fdb7-fbca-401a-aaf5-a7b7b6029fdb","staging");
            put("drn:roo:supportable:xx:7cb65d97-533e-4884-a920-08af188b40b1","staging");
            put("drn:roo:supportable:xx:27b78dcd-a92e-4826-b665-595b65e1318f","staging");
            put("drn:roo:supportable:xx:45b88939-a42f-428a-88af-d3224d1dfcef","staging");
            put("drn:roo:supportable:xx:f4c40c9d-91a0-4ede-93e1-5556981641fa","staging");
            put("drn:roo:supportable:xx:bd74c7e8-786d-46a4-b80f-8fefd4f40c47","production");
            put("drn:roo:supportable:xx:2569c1bc-794a-4227-821d-8b96cc75a735","staging");
            put("drn:roo:supportable:xx:c65671b8-b621-4800-87b3-1757e6eae974","production");
            put("drn:roo:supportable:xx:05c1cda9-ceb1-4d1f-b777-14449dfcfb88","staging");
            put("drn:roo:supportable:xx:3f98a6e7-a17d-486f-8ec9-67cacb038fb5","staging");
            put("drn:roo:supportable:xx:342c5443-5056-4256-8b5b-975ee31e8437","staging");
            put("drn:roo:supportable:xx:c38cb728-f331-418d-a2c1-d227d36897a7","staging");
            put("drn:roo:supportable:xx:63c16c76-dee2-459f-aca3-624508f66a91","staging");
            put("drn:roo:supportable:xx:f30813f0-310e-4b85-900b-5be2d195a919","staging");
            put("drn:roo:supportable:xx:e3f339ca-a6dc-40f7-b284-636b6c0c4d87","staging");
            put("drn:roo:supportable:xx:05565d39-b15b-4890-a544-22a6e4ce0924","staging");
            put("drn:roo:supportable:xx:ff45f5fb-d087-44e9-8346-319821c18796","staging");
            put("drn:roo:supportable:xx:a76a8961-875f-4e98-9a5d-e2b28a410e79","staging");
            put("drn:roo:supportable:xx:865af903-9a19-457c-a0d4-e608e4668fad","staging");
            put("drn:roo:supportable:xx:d22b0838-d3db-46a2-96fe-1f305e3d8779","production");
            put("drn:roo:supportable:xx:28d6baec-0f75-4c26-a5f5-5c7b313d5c5e","staging");
            put("drn:roo:supportable:xx:f0f0fa99-e701-4a03-ad9c-3b451a51b5f4","staging");
            put("drn:roo:supportable:xx:c9454f1e-52b1-45e2-9cf0-39df6380772a","staging");
            put("drn:roo:supportable:xx:35768caf-3b0b-4788-8e75-770b91960a73","staging");
            put("drn:roo:supportable:xx:2575b686-c0df-443b-903c-f1d69feb78e5","staging");
            put("drn:roo:supportable:xx:3f4762bc-56db-4627-a08e-7e74eb5a1048","staging");
            put("drn:roo:supportable:xx:3b820ac4-ca2c-45d8-b6b0-74c86ffb44e8","production");
            put("drn:roo:supportable:xx:5e8089b8-80ee-44e4-a29d-0c16888b4e9a","staging");
            put("drn:roo:supportable:xx:463df763-bd5b-4b9a-a5ce-c72757d5e3b5","staging");
            put("drn:roo:supportable:xx:4b5f74ce-17cd-41ab-8b97-531fdfa84869","production");
            put("drn:roo:supportable:xx:2433cf9c-1b79-47ca-884b-394b5988a2d3","staging");
            put("drn:roo:supportable:xx:9dbc4767-c8ae-44b1-b73a-5f494e7ca1d4","staging");
            put("drn:roo:supportable:xx:e5f84afc-2007-4333-8c31-6d5fdb00470b","staging");
            put("drn:roo:supportable:xx:9de80d62-1a36-4477-a422-9ef809e31f03","staging");
            put("drn:roo:supportable:xx:6d02e7df-63fd-4596-89ef-8a915c63b207","staging");
            put("drn:roo:supportable:xx:15191b54-71b9-46d0-a6e0-1ae4b01f91a3","staging");
            put("drn:roo:supportable:xx:f877d4ba-5f3b-41e9-af03-75a7dc96d234","production");
            put("drn:roo:supportable:xx:c6557211-7ffc-4175-8119-e54e6eff203f","staging");
            put("drn:roo:supportable:xx:328a472d-9c52-4635-90b9-9a1edbb2ac22","production");
            put("drn:roo:supportable:xx:f0c39753-239f-42a7-8aef-ff23991b41e9","staging");
            put("drn:roo:supportable:xx:c8873110-d464-43be-bab9-81ef25096d33","production");
            put("drn:roo:supportable:xx:4a32f3ac-f41f-438f-b889-4562ccdc6e66","production");
            put("drn:roo:supportable:xx:bafb7596-3961-45e1-b5e4-3268586e18a9","staging");
            put("drn:roo:supportable:xx:eddb19bb-cfcc-4ec6-8ece-a8759ea46fde","staging");
            put("drn:roo:supportable:xx:86aa4461-cfb2-4531-8e5d-ab3cf72883c5","staging");
            put("drn:roo:supportable:xx:8ae0f79f-c16a-4620-9cb4-04cea8608e3f","production");
            put("drn:roo:supportable:xx:9701bb5a-f280-4ca0-85a8-cd57f3596d4b","staging");
            put("drn:roo:supportable:xx:82bdc300-bdd2-4fee-8448-c5d44773135c","production");
            put("drn:roo:supportable:xx:31d2cd5c-a87c-412f-8d9e-bcf8d127a1b8","staging");
            put("drn:roo:supportable:xx:e063f857-ad69-4402-acfe-cc509c33e1e7","production");
            put("drn:roo:supportable:xx:29dd79f5-30ad-42ae-9dce-6240f591820a","production");
            put("drn:roo:supportable:xx:a7330b2e-4072-4307-927c-62ca2b44e5c7","staging");
            put("drn:roo:supportable:xx:d5af4f73-ae1a-4a2f-a3b6-6198abc487bc","production");
            put("drn:roo:supportable:xx:5c7c665f-1d9d-400e-b066-c5fcda120d85","staging");
            put("drn:roo:supportable:xx:22a1d836-eb3e-4225-8ad9-c31502a5fc07","staging");
            put("drn:roo:supportable:xx:95590fad-f412-406c-9ebe-af4555531d10","production");
            put("drn:roo:supportable:xx:a89ea8d6-1fed-406f-ac7a-2bf83337bde3","production");
            put("drn:roo:supportable:xx:d29e437b-af86-4d97-a0c7-bd8b163278de","staging");
            put("drn:roo:supportable:xx:53f82dca-3054-4855-93b0-09be3bb050e9","production");
            put("drn:roo:supportable:xx:ffd0588b-3f32-4382-aeef-5b2ee31a052d","production");
            put("drn:roo:supportable:xx:4b8a741b-8fbb-4c84-82c7-2633948cf803","production");
            put("drn:roo:supportable:xx:2b48138c-3857-4a11-8f30-5ef8143443c3","staging");
            put("drn:roo:supportable:xx:2f8fcfcd-1326-40bf-9e4b-2e95566bc8b9","staging");
            put("drn:roo:supportable:xx:0ec4483a-ec5e-4b0f-a1e5-c66f14d05f74","staging");
            put("drn:roo:supportable:xx:c3bc8e1b-14f8-49a2-ab31-6701b215af2f","staging");
            put("drn:roo:supportable:xx:f531f93e-8e9f-4152-86f7-fe66db186294","production");
            put("unassigned","staging");
            put("drn:roo:supportable:xx:cef6a4f7-8f19-44a7-bb50-f8694350a630","staging");
            put("drn:roo:supportable:xx:4c22a2f6-75a6-4698-ba44-82a3876be084","production");
            put("drn:roo:supportable:xx:b94213d8-90e5-4396-bd54-8ba5b722f5ab","staging");
            put("drn:roo:supportable:xx:9ed325ae-374c-409b-a6dc-9249072a0dee","staging");
            put("drn:roo:supportable:xx:f331a9e9-7a0b-41c3-bc5d-38992a35c369","staging");
            put("drn:roo:supportable:xx:fb6352dc-3f1b-4d6b-8b80-c171447a6183","production");
            put("drn:roo:supportable:xx:78d4d994-da35-4cc2-ac3d-5682f9696353","production");
            put("drn:roo:supportable:xx:8922a767-f741-4bef-a8c9-a3ecaee10f6e","staging");
            put("drn:roo:supportable:xx:877581eb-f5f8-4e3a-8281-96003d7ef39c","staging");
            put("drn:roo:supportable:xx:eccaa566-1742-44a2-9a1e-e79a4e6d385b","staging");
            put("drn:roo:supportable:xx:d47a7d15-9277-47bb-a36e-fcc277cb4250","staging");
            put("drn:roo:supportable:xx:3600b678-cf55-490a-b577-85b3c1bd87c3","production");
            put("drn:roo:supportable:xx:8d5af30a-a850-4562-b0e9-8ccbf2a1500e","production");
            put("drn:roo:supportable:xx:11e447a3-ccd0-4be4-8c8b-57f26ca18602","staging");
            put("drn:roo:supportable:xx:b35156c8-543d-4543-89bf-d19b419bfef8","production");
            put("drn:roo:supportable:xx:b4296dea-76fa-409e-9842-7e0f7c69377c","production");
            put("drn:roo:supportable:xx:e5eaee92-3659-4b96-aab7-cbc4e69aee5e","staging");
            put("drn:roo:supportable:xx:1be6a6f2-ee7c-4b98-ad72-7fe2ad758429","staging");
            put("drn:roo:supportable:xx:5ce833de-37d6-48c4-ace5-218b31fd93e4","staging");
            put("drn:roo:supportable:xx:d699860c-82d2-4c08-bdc0-a934eef48033","staging");
            put("drn:roo:supportable:xx:8492aee7-798c-4d07-904b-950ab4f01aa2","staging");
            put("drn:roo:supportable:xx:94dfdf61-1928-48b3-8466-80808f3de012","staging");
            put("drn:roo:supportable:xx:41147aa6-9b72-4650-b364-d3a985fad664","staging");
            put("drn:roo:supportable:xx:aee9d96f-7149-4ac4-855a-de477999ddc9","staging");
            put("drn:roo:supportable:xx:680573e1-fec1-4534-9423-9a27da514378","staging");
            put("drn:roo:supportable:xx:c9398649-c87a-41a2-941c-bc52c5938d27","staging");
            put("drn:roo:supportable:xx:872c2c98-d68e-4343-846a-1e254b4d6252","production");
            put("drn:roo:supportable:xx:7d54730c-415b-4c7a-a3d9-773110dabf4e","production");
            put("drn:roo:supportable:xx:d7959353-b4f3-4294-87d0-460715f29737","production");
            put("drn:roo:supportable:xx:e42b6813-1e3e-4059-a2f8-b861f4f9f872","staging");
            put("drn:roo:supportable:xx:5c3af63c-9f4d-4961-9748-651df13a7214","staging");
            put("drn:roo:supportable:xx:a6e4246a-0ce8-4541-b563-89c31b88a27d","staging");
            put("drn:roo:supportable:xx:72346999-cf69-4806-b404-e6da130aa601","staging");
            put("drn:roo:supportable:xx:0df48ba7-865e-4f45-a27e-f1097d177f6e","production");
            put("drn:roo:supportable:xx:0be96b60-0f86-450b-8a81-94163c74f4c4","staging");
            put("drn:roo:supportable:xx:7004b564-b87d-4500-b808-1b47fd194b3e","staging");
            put("drn:roo:supportable:xx:9b0098e9-b4d8-4941-852e-e75b60f48ef1","staging");
            put("drn:roo:supportable:xx:3cd2b44f-ae92-4c66-a1fd-66d01de7e899","staging");
            put("drn:roo:supportable:xx:15e5350e-6191-41e2-a769-560b5bfe91d9","staging");
            put("drn:roo:supportable:xx:d5d344a6-7d38-4d80-9221-f52f27d2639b","production");
            put("drn:roo:supportable:xx:f193e2cf-4465-47ba-9731-3b8dc8d3289f","staging");
            put("drn:roo:supportable:xx:6852e2f4-fa84-429f-8cc4-e591129bfbd7","staging");
            put("drn:roo:supportable:xx:a332d092-14c9-4da0-a709-39579de39956","staging");
            put("drn:roo:supportable:xx:82f32834-d7c0-4ef1-99f4-5b28fca48ac8","staging");
            put("drn:roo:supportable:xx:e2e9cbdc-6545-43fe-9b03-b7bf780980d6","staging");
            put("drn:roo:supportable:xx:f75890ee-5158-4650-b4e2-b3dde4d691eb","staging");
            put("drn:roo:supportable:xx:99f06b74-9029-4161-b928-6f5adf586126","staging");
            put("drn:roo:supportable:xx:5637aad7-26bd-4f40-a2eb-78eabb48529e","staging");
            put("drn:roo:supportable:xx:fa307d18-1b39-43e3-a21a-fb3d76c48de8","staging");
            put("drn:roo:supportable:xx:fd5b2367-c4c4-437e-a8cd-c97da12cad31","production");
            put("drn:roo:supportable:xx:eb53ff30-f8dd-4d0a-bd6d-c7288f776135","staging");
            put("drn:roo:supportable:xx:22cfdf59-68ab-4541-ab44-90cb521e96d3","staging");
            put("drn:roo:supportable:xx:6ab2be1a-4119-4dea-b4a6-b2ca2b4e2208","production");
            put("drn:roo:supportable:xx:a207d519-7cad-453c-a1eb-7019bc73c09e","production");
            put("drn:roo:supportable:xx:5fc45aee-3da3-4011-9150-f20f1da4c1ec","staging");
            put("drn:roo:supportable:xx:184182ff-af30-4867-bc1a-c035960d126f","staging");
            put("drn:roo:supportable:xx:d2ab9b04-816f-4ee4-b858-b0631ec2d3cc","staging");
            put("drn:roo:supportable:xx:6794b3e2-3f56-414d-bf5d-e45caa86d622","production");
            put("drn:roo:supportable:xx:500b88ce-ebe8-42fa-aef1-7ab7a97a2ec1","staging");
            put("drn:roo:supportable:xx:8e5f7046-6a9f-4770-9303-cae686a0ea75","staging");
            put("drn:roo:supportable:xx:f812a17f-c6a0-4689-bc52-19c3ad506607","staging");
            put("drn:roo:supportable:xx:f67b3841-8511-4307-9af7-9ab6cba6beb6","staging");
            put("drn:roo:supportable:xx:4bdd8e37-9c94-487b-8cb9-9818b8f5640c","staging");
            put("drn:roo:supportable:xx:ca9f11fe-43fe-468c-9e7f-61b9ebdc0cfe","staging");
            put("drn:roo:supportable:xx:8fc78c5a-cd3d-4d20-a316-8e497f05d4b4","production");
            put("drn:roo:supportable:xx:beaf31ff-4cc7-4183-a66a-1a188d986054","staging");
            put("drn:roo:supportable:xx:555b1fec-9afb-4628-b699-c9e478347816","staging");
            put("drn:roo:supportable:xx:6516ddcc-bc84-4a20-b6c4-0766bfef0766","staging");
            put("drn:roo:supportable:xx:8e9a4417-76fb-427a-83bc-d9a895746f30","production");
            put("drn:roo:supportable:xx:d58ae631-9d74-4a1a-9b2c-4a96944fa65a","staging");
            put("drn:roo:supportable:xx:faec5170-be53-4b45-afa5-a80228593ffd","production");
            put("drn:roo:supportable:xx:7333f8fb-98ea-4b38-a6db-d17b83f00d88","staging");
            put("drn:roo:supportable:xx:fc183601-09c3-441c-96b1-4395cd0b4584","staging");
            put("drn:roo:supportable:xx:8ddb65ae-6985-4b12-b6c1-deb7ac96b003","production");
            put("drn:roo:supportable:xx:40a86d1e-fe61-485c-9c68-4270af146d75","staging");
            put("drn:roo:supportable:xx:1671b072-3887-4607-85e0-1498f75f9cc5","staging");
            put("drn:roo:supportable:xx:b1325ee6-eeaa-42d8-9875-834bf426a600","staging");
            put("drn:roo:supportable:xx:a8fb5bbd-9421-4112-a781-7c981204173d","staging");
            put("drn:roo:supportable:xx:86b90553-85cf-487d-be8f-916bb89078b7","staging");
            put("drn:roo:supportable:xx:9aab1fa5-fb77-44d1-9263-49f92148a981","production");
            put("drn:roo:supportable:xx:7a0bdcbd-658d-48e9-981f-53470215c962","staging");
            put("drn:roo:supportable:xx:787e3390-d076-4010-9347-8b4877a4c5a5","staging");
            put("drn:roo:supportable:xx:68808efb-f102-4617-a763-5bfaa0459216","staging");
            put("drn:roo:supportable:xx:f0100595-30b4-48db-b9aa-8843cb3984c9","production");
            put("drn:roo:supportable:xx:46ddcd81-80f3-44c9-a215-61887c48a52d","staging");
            put("drn:roo:supportable:xx:8a36c321-e7ec-402e-ae0d-f99de18a5477","staging");
            put("drn:roo:supportable:xx:2555e9ff-ff87-4675-aa7b-01da58df0c17","staging");
            put("drn:roo:supportable:xx:924d2fd9-ccd0-41fd-9ee2-a6040e581530","production");
            put("drn:roo:supportable:xx:4678c059-f54d-4fda-bc03-e370c249e85d","staging");
            put("drn:roo:supportable:xx:15d8d49d-a9c3-4e54-b3bc-366ec83b8a08","staging");
            put("drn:roo:supportable:xx:7fcf6c47-ddc7-4d76-842c-c729394e5801","staging");
            put("drn:roo:supportable:xx:6b9cba23-0096-49d5-85a8-40a6d96b283d","production");
            put("drn:roo:supportable:xx:1dbedece-27b3-4188-9835-79baa0e2f572","staging");
            put("drn:roo:supportable:xx:8aeee8fe-1d03-4315-abf6-e525512d20a2","staging");
            put("drn:roo:supportable:xx:b5b72262-1e1f-4c1c-9dd4-5596f4c53f11","staging");
            put("drn:roo:supportable:xx:82c4eeac-1b3f-400c-b004-136554b3af44","staging");
            put("drn:roo:supportable:xx:c74b0913-e154-4ff7-91a0-b0970f832953","staging");
        }};

        try (CSVParser parser = new CSVParser(new FileReader("/Users/nithinsingamsetti/IdeaProjects/ThreadSpace/src/main/qq.csv"), CSVFormat.DEFAULT)) {
            for (CSVRecord record : parser) {
                // Access fields by index or header name
//                String field1 = record.get(0);
//                System.out.println(field1);
                System.out.println(myMap.get(record.get(0)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
