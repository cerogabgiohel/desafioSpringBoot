PGDMP         $                y            desafio    13.2    13.2 G               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16394    desafio    DATABASE     g   CREATE DATABASE desafio WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE desafio;
                postgres    false            ?            1259    16403    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            ?            1259    16656    id_album_seq    SEQUENCE     u   CREATE SEQUENCE public.id_album_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.id_album_seq;
       public          postgres    false            ?            1259    16508    id_comment_seq    SEQUENCE     w   CREATE SEQUENCE public.id_comment_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.id_comment_seq;
       public          postgres    false            ?            1259    16578    id_image_seq    SEQUENCE     u   CREATE SEQUENCE public.id_image_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.id_image_seq;
       public          postgres    false            ?            1259    16510    id_post_seq    SEQUENCE     t   CREATE SEQUENCE public.id_post_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.id_post_seq;
       public          postgres    false            ?            1259    16512    id_user_seq    SEQUENCE     t   CREATE SEQUENCE public.id_user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.id_user_seq;
       public          postgres    false            ?            1259    16636    tb_album    TABLE     M   CREATE TABLE public.tb_album (
    id bigint NOT NULL,
    user_id bigint
);
    DROP TABLE public.tb_album;
       public         heap    postgres    false            ?            1259    16698    tb_album_image    TABLE     c   CREATE TABLE public.tb_album_image (
    album_id bigint NOT NULL,
    image_id bigint NOT NULL
);
 "   DROP TABLE public.tb_album_image;
       public         heap    postgres    false            ?            1259    16475 
   tb_comment    TABLE     ?   CREATE TABLE public.tb_comment (
    id bigint NOT NULL,
    comment character varying(255),
    post_id bigint,
    user_id bigint,
    text character varying(255)
);
    DROP TABLE public.tb_comment;
       public         heap    postgres    false            ?            1259    16641    tb_image    TABLE     ?   CREATE TABLE public.tb_image (
    id bigint NOT NULL,
    image character varying(255),
    album_id bigint,
    user_id bigint
);
    DROP TABLE public.tb_image;
       public         heap    postgres    false            ?            1259    16480    tb_post    TABLE     m   CREATE TABLE public.tb_post (
    id bigint NOT NULL,
    post character varying(255),
    user_id bigint
);
    DROP TABLE public.tb_post;
       public         heap    postgres    false            ?            1259    16485    tb_post_comments    TABLE     ?   CREATE TABLE public.tb_post_comments (
    post_id bigint NOT NULL,
    comments_id bigint NOT NULL,
    comments_id_comment bigint NOT NULL
);
 $   DROP TABLE public.tb_post_comments;
       public         heap    postgres    false            ?            1259    16488    tb_user    TABLE     ~   CREATE TABLE public.tb_user (
    id bigint NOT NULL,
    name character varying(255),
    password character varying(255)
);
    DROP TABLE public.tb_user;
       public         heap    postgres    false            ?            1259    16646    tb_user_album    TABLE     a   CREATE TABLE public.tb_user_album (
    user_id bigint NOT NULL,
    album_id bigint NOT NULL
);
 !   DROP TABLE public.tb_user_album;
       public         heap    postgres    false            ?            1259    16496    tb_user_comment    TABLE     ?   CREATE TABLE public.tb_user_comment (
    user_id bigint NOT NULL,
    comment_id bigint NOT NULL,
    comment_id_comment bigint NOT NULL
);
 #   DROP TABLE public.tb_user_comment;
       public         heap    postgres    false            ?            1259    16649    tb_user_image    TABLE     a   CREATE TABLE public.tb_user_image (
    user_id bigint NOT NULL,
    image_id bigint NOT NULL
);
 !   DROP TABLE public.tb_user_image;
       public         heap    postgres    false            ?            1259    16499    tb_user_post    TABLE     _   CREATE TABLE public.tb_user_post (
    user_id bigint NOT NULL,
    post_id bigint NOT NULL
);
     DROP TABLE public.tb_user_post;
       public         heap    postgres    false                      0    16636    tb_album 
   TABLE DATA           /   COPY public.tb_album (id, user_id) FROM stdin;
    public          postgres    false    211   V                 0    16698    tb_album_image 
   TABLE DATA           <   COPY public.tb_album_image (album_id, image_id) FROM stdin;
    public          postgres    false    216   ;V                 0    16475 
   tb_comment 
   TABLE DATA           I   COPY public.tb_comment (id, comment, post_id, user_id, text) FROM stdin;
    public          postgres    false    201   XV                 0    16641    tb_image 
   TABLE DATA           @   COPY public.tb_image (id, image, album_id, user_id) FROM stdin;
    public          postgres    false    212   ?V                 0    16480    tb_post 
   TABLE DATA           4   COPY public.tb_post (id, post, user_id) FROM stdin;
    public          postgres    false    202   X       	          0    16485    tb_post_comments 
   TABLE DATA           U   COPY public.tb_post_comments (post_id, comments_id, comments_id_comment) FROM stdin;
    public          postgres    false    203   mX       
          0    16488    tb_user 
   TABLE DATA           5   COPY public.tb_user (id, name, password) FROM stdin;
    public          postgres    false    204   ?X                 0    16646    tb_user_album 
   TABLE DATA           :   COPY public.tb_user_album (user_id, album_id) FROM stdin;
    public          postgres    false    213   Y                 0    16496    tb_user_comment 
   TABLE DATA           R   COPY public.tb_user_comment (user_id, comment_id, comment_id_comment) FROM stdin;
    public          postgres    false    205   )Y                 0    16649    tb_user_image 
   TABLE DATA           :   COPY public.tb_user_image (user_id, image_id) FROM stdin;
    public          postgres    false    214   FY                 0    16499    tb_user_post 
   TABLE DATA           8   COPY public.tb_user_post (user_id, post_id) FROM stdin;
    public          postgres    false    206   cY                  0    0    hibernate_sequence    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hibernate_sequence', 10, true);
          public          postgres    false    200                       0    0    id_album_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.id_album_seq', 25, true);
          public          postgres    false    215                       0    0    id_comment_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.id_comment_seq', 12, true);
          public          postgres    false    207                        0    0    id_image_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.id_image_seq', 18, true);
          public          postgres    false    210            !           0    0    id_post_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.id_post_seq', 14, true);
          public          postgres    false    208            "           0    0    id_user_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.id_user_seq', 19, true);
          public          postgres    false    209            g           2606    16640    tb_album tb_album_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tb_album
    ADD CONSTRAINT tb_album_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.tb_album DROP CONSTRAINT tb_album_pkey;
       public            postgres    false    211            W           2606    16479    tb_comment tb_comment_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.tb_comment
    ADD CONSTRAINT tb_comment_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.tb_comment DROP CONSTRAINT tb_comment_pkey;
       public            postgres    false    201            i           2606    16645    tb_image tb_image_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.tb_image
    ADD CONSTRAINT tb_image_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.tb_image DROP CONSTRAINT tb_image_pkey;
       public            postgres    false    212            Y           2606    16484    tb_post tb_post_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.tb_post
    ADD CONSTRAINT tb_post_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.tb_post DROP CONSTRAINT tb_post_pkey;
       public            postgres    false    202            _           2606    16495    tb_user tb_user_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.tb_user
    ADD CONSTRAINT tb_user_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.tb_user DROP CONSTRAINT tb_user_pkey;
       public            postgres    false    204            [           2606    16503 -   tb_post_comments uk_2gxpqa4e6tbykl01670i6txu5 
   CONSTRAINT     o   ALTER TABLE ONLY public.tb_post_comments
    ADD CONSTRAINT uk_2gxpqa4e6tbykl01670i6txu5 UNIQUE (comments_id);
 W   ALTER TABLE ONLY public.tb_post_comments DROP CONSTRAINT uk_2gxpqa4e6tbykl01670i6txu5;
       public            postgres    false    203            a           2606    16505 ,   tb_user_comment uk_9u158ifn6dhmnqlj4kaq3qjkx 
   CONSTRAINT     m   ALTER TABLE ONLY public.tb_user_comment
    ADD CONSTRAINT uk_9u158ifn6dhmnqlj4kaq3qjkx UNIQUE (comment_id);
 V   ALTER TABLE ONLY public.tb_user_comment DROP CONSTRAINT uk_9u158ifn6dhmnqlj4kaq3qjkx;
       public            postgres    false    205            m           2606    16655 *   tb_user_image uk_flx9xuhpclw9e8fnrkddft8xp 
   CONSTRAINT     i   ALTER TABLE ONLY public.tb_user_image
    ADD CONSTRAINT uk_flx9xuhpclw9e8fnrkddft8xp UNIQUE (image_id);
 T   ALTER TABLE ONLY public.tb_user_image DROP CONSTRAINT uk_flx9xuhpclw9e8fnrkddft8xp;
       public            postgres    false    214            c           2606    16562 ,   tb_user_comment uk_jt2mpntukfs7ggv01envvc0ig 
   CONSTRAINT     u   ALTER TABLE ONLY public.tb_user_comment
    ADD CONSTRAINT uk_jt2mpntukfs7ggv01envvc0ig UNIQUE (comment_id_comment);
 V   ALTER TABLE ONLY public.tb_user_comment DROP CONSTRAINT uk_jt2mpntukfs7ggv01envvc0ig;
       public            postgres    false    205            k           2606    16653 *   tb_user_album uk_ktd0qu8febbxa1y1p28gevboy 
   CONSTRAINT     i   ALTER TABLE ONLY public.tb_user_album
    ADD CONSTRAINT uk_ktd0qu8febbxa1y1p28gevboy UNIQUE (album_id);
 T   ALTER TABLE ONLY public.tb_user_album DROP CONSTRAINT uk_ktd0qu8febbxa1y1p28gevboy;
       public            postgres    false    213            e           2606    16507 (   tb_user_post uk_pbjhwtlq6voe10wiw6slj8dy 
   CONSTRAINT     f   ALTER TABLE ONLY public.tb_user_post
    ADD CONSTRAINT uk_pbjhwtlq6voe10wiw6slj8dy UNIQUE (post_id);
 R   ALTER TABLE ONLY public.tb_user_post DROP CONSTRAINT uk_pbjhwtlq6voe10wiw6slj8dy;
       public            postgres    false    206            ]           2606    16560 -   tb_post_comments uk_q4fwhgg3sel3ekrca738am8jt 
   CONSTRAINT     w   ALTER TABLE ONLY public.tb_post_comments
    ADD CONSTRAINT uk_q4fwhgg3sel3ekrca738am8jt UNIQUE (comments_id_comment);
 W   ALTER TABLE ONLY public.tb_post_comments DROP CONSTRAINT uk_q4fwhgg3sel3ekrca738am8jt;
       public            postgres    false    203            o           2606    16702 +   tb_album_image uk_qej5qdcxiadukevqw3iow0nsk 
   CONSTRAINT     j   ALTER TABLE ONLY public.tb_album_image
    ADD CONSTRAINT uk_qej5qdcxiadukevqw3iow0nsk UNIQUE (image_id);
 U   ALTER TABLE ONLY public.tb_album_image DROP CONSTRAINT uk_qej5qdcxiadukevqw3iow0nsk;
       public            postgres    false    216            x           2606    16568 +   tb_user_comment fk2ab0jpqmbo2akfqvpcy8g9iat    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_comment
    ADD CONSTRAINT fk2ab0jpqmbo2akfqvpcy8g9iat FOREIGN KEY (comment_id_comment) REFERENCES public.tb_comment(id);
 U   ALTER TABLE ONLY public.tb_user_comment DROP CONSTRAINT fk2ab0jpqmbo2akfqvpcy8g9iat;
       public          postgres    false    2903    205    201            z           2606    16554 (   tb_user_post fk30mu29lvwfohkwvkm1eq6rrev    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_post
    ADD CONSTRAINT fk30mu29lvwfohkwvkm1eq6rrev FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 R   ALTER TABLE ONLY public.tb_user_post DROP CONSTRAINT fk30mu29lvwfohkwvkm1eq6rrev;
       public          postgres    false    204    206    2911            t           2606    16534 ,   tb_post_comments fk3c5w00881fodxvlqkuxi1otr0    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_post_comments
    ADD CONSTRAINT fk3c5w00881fodxvlqkuxi1otr0 FOREIGN KEY (post_id) REFERENCES public.tb_post(id);
 V   ALTER TABLE ONLY public.tb_post_comments DROP CONSTRAINT fk3c5w00881fodxvlqkuxi1otr0;
       public          postgres    false    202    2905    203            q           2606    16519 &   tb_comment fk45c1cuqlljd60ihc9j0962ekq    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_comment
    ADD CONSTRAINT fk45c1cuqlljd60ihc9j0962ekq FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 P   ALTER TABLE ONLY public.tb_comment DROP CONSTRAINT fk45c1cuqlljd60ihc9j0962ekq;
       public          postgres    false    2911    201    204            v           2606    16539 +   tb_user_comment fk9126uqvbophl777wvs63k7yxw    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_comment
    ADD CONSTRAINT fk9126uqvbophl777wvs63k7yxw FOREIGN KEY (comment_id) REFERENCES public.tb_comment(id);
 U   ALTER TABLE ONLY public.tb_user_comment DROP CONSTRAINT fk9126uqvbophl777wvs63k7yxw;
       public          postgres    false    2903    205    201            ~           2606    16678 )   tb_user_album fkbo2juaqrvgg54ada3kwj2449x    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_album
    ADD CONSTRAINT fkbo2juaqrvgg54ada3kwj2449x FOREIGN KEY (album_id) REFERENCES public.tb_album(id);
 S   ALTER TABLE ONLY public.tb_user_album DROP CONSTRAINT fkbo2juaqrvgg54ada3kwj2449x;
       public          postgres    false    2919    213    211            |           2606    16663 $   tb_image fkd1l5n9jln3kduckjbcvce9286    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_image
    ADD CONSTRAINT fkd1l5n9jln3kduckjbcvce9286 FOREIGN KEY (album_id) REFERENCES public.tb_album(id);
 N   ALTER TABLE ONLY public.tb_image DROP CONSTRAINT fkd1l5n9jln3kduckjbcvce9286;
       public          postgres    false    2919    212    211            p           2606    16514 &   tb_comment fkebak8c8m45519djplq0wanuj3    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_comment
    ADD CONSTRAINT fkebak8c8m45519djplq0wanuj3 FOREIGN KEY (post_id) REFERENCES public.tb_post(id);
 P   ALTER TABLE ONLY public.tb_comment DROP CONSTRAINT fkebak8c8m45519djplq0wanuj3;
       public          postgres    false    201    202    2905            w           2606    16544 +   tb_user_comment fkf3s2r0k5ak7h8o90cvchabk96    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_comment
    ADD CONSTRAINT fkf3s2r0k5ak7h8o90cvchabk96 FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 U   ALTER TABLE ONLY public.tb_user_comment DROP CONSTRAINT fkf3s2r0k5ak7h8o90cvchabk96;
       public          postgres    false    204    2911    205            s           2606    16529 ,   tb_post_comments fkfh357shttv8ipjyep8o19c78f    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_post_comments
    ADD CONSTRAINT fkfh357shttv8ipjyep8o19c78f FOREIGN KEY (comments_id) REFERENCES public.tb_comment(id);
 V   ALTER TABLE ONLY public.tb_post_comments DROP CONSTRAINT fkfh357shttv8ipjyep8o19c78f;
       public          postgres    false    203    201    2903            u           2606    16563 ,   tb_post_comments fkfk9pdvwbcmuld1kd6x243hhhp    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_post_comments
    ADD CONSTRAINT fkfk9pdvwbcmuld1kd6x243hhhp FOREIGN KEY (comments_id_comment) REFERENCES public.tb_comment(id);
 V   ALTER TABLE ONLY public.tb_post_comments DROP CONSTRAINT fkfk9pdvwbcmuld1kd6x243hhhp;
       public          postgres    false    2903    201    203            ?           2606    16708 *   tb_album_image fkgqtakvftro2y1et1v6ak26haj    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_album_image
    ADD CONSTRAINT fkgqtakvftro2y1et1v6ak26haj FOREIGN KEY (album_id) REFERENCES public.tb_album(id);
 T   ALTER TABLE ONLY public.tb_album_image DROP CONSTRAINT fkgqtakvftro2y1et1v6ak26haj;
       public          postgres    false    211    2919    216                       2606    16683 )   tb_user_album fkgr26a4xsv3jf1q7vosumt2v9j    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_album
    ADD CONSTRAINT fkgr26a4xsv3jf1q7vosumt2v9j FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 S   ALTER TABLE ONLY public.tb_user_album DROP CONSTRAINT fkgr26a4xsv3jf1q7vosumt2v9j;
       public          postgres    false    204    2911    213            r           2606    16524 #   tb_post fkhx7a7k3pf66vpddqg5pr12anw    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_post
    ADD CONSTRAINT fkhx7a7k3pf66vpddqg5pr12anw FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 M   ALTER TABLE ONLY public.tb_post DROP CONSTRAINT fkhx7a7k3pf66vpddqg5pr12anw;
       public          postgres    false    202    2911    204            ?           2606    16688 )   tb_user_image fklvn63qv8put53va5muy6cw1im    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_image
    ADD CONSTRAINT fklvn63qv8put53va5muy6cw1im FOREIGN KEY (image_id) REFERENCES public.tb_image(id);
 S   ALTER TABLE ONLY public.tb_user_image DROP CONSTRAINT fklvn63qv8put53va5muy6cw1im;
       public          postgres    false    212    2921    214            {           2606    16658 $   tb_album fko19sxxa30agnfbga90y1usnwi    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_album
    ADD CONSTRAINT fko19sxxa30agnfbga90y1usnwi FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 N   ALTER TABLE ONLY public.tb_album DROP CONSTRAINT fko19sxxa30agnfbga90y1usnwi;
       public          postgres    false    2911    204    211            }           2606    16668 $   tb_image fkp2u0vit28m3kwihjrara1507y    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_image
    ADD CONSTRAINT fkp2u0vit28m3kwihjrara1507y FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 N   ALTER TABLE ONLY public.tb_image DROP CONSTRAINT fkp2u0vit28m3kwihjrara1507y;
       public          postgres    false    204    212    2911            ?           2606    16693 )   tb_user_image fkpjsp39m1pa1vn3p2qryw4ak90    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_image
    ADD CONSTRAINT fkpjsp39m1pa1vn3p2qryw4ak90 FOREIGN KEY (user_id) REFERENCES public.tb_user(id);
 S   ALTER TABLE ONLY public.tb_user_image DROP CONSTRAINT fkpjsp39m1pa1vn3p2qryw4ak90;
       public          postgres    false    204    214    2911            y           2606    16549 (   tb_user_post fkq0ap08f7liowj73r79ih78vq0    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_user_post
    ADD CONSTRAINT fkq0ap08f7liowj73r79ih78vq0 FOREIGN KEY (post_id) REFERENCES public.tb_post(id);
 R   ALTER TABLE ONLY public.tb_user_post DROP CONSTRAINT fkq0ap08f7liowj73r79ih78vq0;
       public          postgres    false    2905    206    202            ?           2606    16703 *   tb_album_image fktlqgywf7oqu6a9bxjh88si3d6    FK CONSTRAINT     ?   ALTER TABLE ONLY public.tb_album_image
    ADD CONSTRAINT fktlqgywf7oqu6a9bxjh88si3d6 FOREIGN KEY (image_id) REFERENCES public.tb_image(id);
 T   ALTER TABLE ONLY public.tb_album_image DROP CONSTRAINT fktlqgywf7oqu6a9bxjh88si3d6;
       public          postgres    false    216    2921    212                  x??????21z\\\ ??            x?????? ? ?         _   x?3?,I-.I?K?W?WH??M?+9??(3_!??41'?*1%??Ѐ3Ə?I2?4/93???˜?5%?	 =????@?zC#???N?????? ??/?         .  x?U?QK?0F?????7I???l?D??"cPnӬ?k?Ф?????}???9l6?{o??FߵR?d{D->?>D??wX?B??4??+	??K?????0Hvo?q??*????yc:?Q???Vע56???&???ͦ????,????Re??É:?a2??t?}?TڰP??F?Pu+W??òxY?Ci??Vls??7????*y"O;??;I?x??,tI?	???|????_t??R?'?k?V?wت?S??pw?9#?$X?????!8eS`(?'?Z?%a4?)??<?韌m?7mj??         X   x?3?,I-.I?K?W?W(?/.QH,)M?ɬJL??44?24????˂?/?,_?(U?( ?$9?W!8??,39?3Ə?Є?"C?=... S?.      	      x?????? ? ?      
   r   x?%?1
?@??+?????:????i?C?"???sG?-fg?N??['qG?8???8=:?X?+?????s?SL?>?X5,6?8?K32?Q??aUb???? .?$            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?     