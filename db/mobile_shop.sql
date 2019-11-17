/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : mobile_shop

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 17/11/2019 20:40:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ms_admin
-- ----------------------------
DROP TABLE IF EXISTS `ms_admin`;
CREATE TABLE `ms_admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员用户名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员邮箱',
  `real_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员真实姓名',
  `sex` smallint(6) NULL DEFAULT NULL COMMENT '管理员性别',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员电话',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色编号',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 48 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_admin
-- ----------------------------
INSERT INTO `ms_admin` VALUES (3, 'ls2016', '4QrcOUm6Wau+VuBX8g+IPg==', 'ls@qq.com', '李四', 1, '13398765432', 2, '2016-12-01 00:54:07', '2016-12-01 08:33:41');
INSERT INTO `ms_admin` VALUES (4, 'wangwu', '1B2M2Y8AsgTpgAmY7PhCfg==', 'www@qq.com', '王五五', 0, '18976544321', 3, '2016-12-01 06:59:43', '2016-12-20 02:49:38');
INSERT INTO `ms_admin` VALUES (5, 'zs2016', '4QrcOUm6Wau+VuBX8g+IPg==', 'zs@qq.com', '张三', 0, '13323456789', 1, '2016-12-01 08:31:18', '2016-12-01 08:35:24');
INSERT INTO `ms_admin` VALUES (39, '', 'lueSGJZetyySpUndWjMBEg==', '', 'zhangsansan', 0, '18909876543', 3, '2016-12-27 08:00:04', '2016-12-27 08:00:04');
INSERT INTO `ms_admin` VALUES (40, '', 'lueSGJZetyySpUndWjMBEg==', '', '李思思', 0, '13365479876', 3, '2016-12-29 02:03:29', '2016-12-29 02:03:29');
INSERT INTO `ms_admin` VALUES (41, '', 'lueSGJZetyySpUndWjMBEg==', '', 'åé', 0, '18923456633', 1, '2016-12-29 02:03:54', '2016-12-29 02:03:54');
INSERT INTO `ms_admin` VALUES (42, '', 'lueSGJZetyySpUndWjMBEg==', '', 'å°ç', 0, '1232321122', 2, '2016-12-29 02:38:06', '2016-12-29 02:38:06');
INSERT INTO `ms_admin` VALUES (43, '', 'lueSGJZetyySpUndWjMBEg==', '', '小张', 0, '12234553', 1, '2016-12-29 02:40:15', '2016-12-29 02:40:15');
INSERT INTO `ms_admin` VALUES (44, '', 'lueSGJZetyySpUndWjMBEg==', '', 'å°æ¾', 0, '1829233122', 1, '2016-12-29 02:44:53', '2016-12-29 02:44:53');
INSERT INTO `ms_admin` VALUES (45, '', 'lueSGJZetyySpUndWjMBEg==', '', '小张', 0, '12234554', 1, '2016-12-29 03:22:40', '2016-12-29 03:22:40');
INSERT INTO `ms_admin` VALUES (46, '', 'lueSGJZetyySpUndWjMBEg==', '', '小红', 0, '1892733234', 2, '2016-12-29 07:00:02', '2016-12-29 07:00:02');
INSERT INTO `ms_admin` VALUES (47, '', 'lueSGJZetyySpUndWjMBEg==', '', '华国锋度过', 0, '123333222', 1, '2016-12-29 07:36:31', '2016-12-29 07:36:31');

-- ----------------------------
-- Table structure for ms_brand
-- ----------------------------
DROP TABLE IF EXISTS `ms_brand`;
CREATE TABLE `ms_brand`  (
  `brand_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名称',
  `logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌图标',
  `keywords` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '关键字',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '关于对品牌的描述',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌链接地址',
  `disabled` tinyint(4) NULL DEFAULT NULL COMMENT '是否可用',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建品牌时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改品牌时间',
  PRIMARY KEY (`brand_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '品牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_brand
-- ----------------------------
INSERT INTO `ms_brand` VALUES (2, '良品铺子', '', '休闲食品', '良品铺子是一家集休闲食品研发、加工分装、零售服务的专业品牌连锁运营公司', '', 0, '2016-09-07 07:02:05', '2016-09-07 07:02:05');
INSERT INTO `ms_brand` VALUES (3, '三只松鼠', '', '坚果，零食', '三只松鼠成立于2012年,是中国当前最大的互联网食品品牌，其坚果系列位居全网销量第一', '', 0, '2016-09-07 07:04:35', '2016-09-07 07:04:35');
INSERT INTO `ms_brand` VALUES (4, 'ochirly', '', '女装', 'ochirly欧时力设计主题:复古星魅、魅惑几何、迷人条纹。', '', 0, '2016-09-07 07:06:12', '2016-09-07 07:06:12');
INSERT INTO `ms_brand` VALUES (5, '美之源', '', '果汁', '美汁源是第一家进入浓缩果汁市场的公司。由可口可乐公司所拥有，为世界最大的果汁饮料销售商。', '', 0, '2016-09-08 00:57:52', '2016-09-09 02:40:54');
INSERT INTO `ms_brand` VALUES (6, '汇源', '', '果汁', '汇源果汁是由中国汇源果汁集团生产的一系列果汁产品,“汇源果汁”是中国果汁行业知名品牌。', '', 0, '2016-09-08 00:59:17', '2016-09-08 00:59:17');
INSERT INTO `ms_brand` VALUES (7, '和其正', '', '凉茶', '和其正是福建达利园集团生产的一个凉茶的名称，是中国凉茶行业的一支劲旅，一匹黑马。', '', 0, '2016-09-08 01:00:48', '2016-09-08 01:00:48');
INSERT INTO `ms_brand` VALUES (9, '康师傅', '', '饮料，方便面，糕饼', '康师傅控股有限公司（康师傅公司），总部设于天津市，主要在中国从事生产和销售方便面、饮品、糕饼以及相关配套产业的经营。', '', 0, '2016-09-08 01:21:42', '2016-09-08 01:21:42');
INSERT INTO `ms_brand` VALUES (10, '迪奥', '', '女装、男装、首饰、香水、化妆品,童装', '迪奥公司由法国时装设计师克里斯汀·迪奥（Christian Dior）创立，总部设在巴黎。主要经营女装、男装、首饰、香水、化妆品,童装等高档消费品', 'http://www.dior.cn', 0, '2016-10-17 03:29:00', '2016-10-17 03:29:00');
INSERT INTO `ms_brand` VALUES (11, '范思哲Versace', '', '女装、男装、香水', '该品牌创立于1978年，品牌标志是神话中的蛇妖美杜莎（Medusa），代表着致命的吸引力', 'http://www.versace.com', 0, '2016-10-17 03:59:37', '2016-10-17 08:49:50');
INSERT INTO `ms_brand` VALUES (13, 'Armani', 'Armani', '女装、男装、香水', '国际服装品牌', 'Armani', 0, '2016-11-01 06:58:40', '2016-12-27 08:08:15');
INSERT INTO `ms_brand` VALUES (20, '兰蔻', 'lancom', '法国', '兰蔻1935年诞生于法国，是由Armand Petitjean（阿曼达·珀蒂让）创办的品牌。作为全球知名的高端化妆品品牌，兰蔻涉足护肤、彩妆、香水等多个产品领域，主要面向教育程度、收入水平较高，年龄在25～40岁的成熟女性。', 'http://www.lancome.com.cn/', 0, '2017-01-13 01:18:56', '2017-01-13 01:18:56');
INSERT INTO `ms_brand` VALUES (21, '佰草集', '佰草集', '中草药国产', '佰草集承袭古方经典，全新推出高端“御·五行焕肌系列”，以“五行焕肌方”融汇珍贵草本精华, 结合现代M³微囊技术，层层包裹活性物质，持久缓慢释放，深层焕活肌肤，使肌肤焕发年轻状态。', 'www.herborist.com.cn ', 0, '2017-01-13 01:23:49', '2017-01-13 01:23:49');
INSERT INTO `ms_brand` VALUES (22, '雅诗兰黛', '雅诗兰黛', '美国抗衰修护', '雅诗兰黛是美国雅诗兰黛公司旗下的化妆品旗舰品牌，以抗衰修护护肤品闻名。雅诗兰黛公司是全球领先的大型生产商和销售商。', 'http://www.esteelauder.com.cn/', 0, '2017-01-13 01:26:44', '2017-01-13 01:26:44');
INSERT INTO `ms_brand` VALUES (23, 'VS沙宣洗发水', 'VS沙宣洗发水', '护发', '破格的护发素新理念, 由沙宣每日焕发塑全新演绎。沙宣每日焕发塑,内含发型易控配方,为塑型打好基础,提升发丝塑型潜力。', 'www.vs.com.cn/ ', 0, '2017-01-13 01:28:52', '2017-01-13 01:28:52');
INSERT INTO `ms_brand` VALUES (24, '施华蔻', 'Schwarzkopf', '护发', '施华蔻，世界三大美发品牌之一，受到众多国际专业发型师的认可和推崇。施华蔻，秉承德国尖端美发科技，专注发质问题，成就百年专业沙龙美发品牌!', 'http://www.schwarzkopf.cn/skcn/zh/home.html', 0, '2017-01-13 01:33:43', '2017-01-13 01:33:43');
INSERT INTO `ms_brand` VALUES (25, '优衣库', 'UNIQLO', '服装', 'UNIQLO（日文假名发音：ユニクロ），日本服装品牌，由日本迅销公司建立于1963年，当年是一家销售西服的小服装店，现已成为国际知名服装品牌。', 'http://www.uniqlo.com', 0, '2017-01-13 01:38:22', '2017-01-13 01:38:22');
INSERT INTO `ms_brand` VALUES (26, '李维斯', 'Levi\'s', '服装', 'Levi\'s（李维斯）是来自美国西部最闻名的名字之一。', 'http://www.levi.com.cn', 0, '2017-01-13 01:39:41', '2017-01-13 01:39:41');
INSERT INTO `ms_brand` VALUES (27, '百家好', 'BASIC HOUSE', '服装', '百家好，韩国品牌BASIC HOUSE，1996年在韩国成立，它是目前韩国品牌中知名度和销量双第一的品牌，BASIC HOUSE在韩国已经成为最受大众欢迎的品牌。', 'http://www.baijiahao.com', 0, '2017-01-13 01:41:25', '2017-01-13 01:41:25');
INSERT INTO `ms_brand` VALUES (28, '维尼熊', 'Teenie Weenie小熊', '服装', 'Teenie Weenie中文名“维尼熊”可不是英国的小熊维尼，它是韩国衣恋集团品牌持有人。韩国自创品牌“TEENIE WEENIE”的休闲装深受年轻一代的喜爱，除了卡通小熊顽皮多样的造型，它轻松自然的设计风格、舒适柔和的质地也深受年轻一代的喜爱。', 'http://www.teenieweenie.com.cn', 0, '2017-01-13 01:43:45', '2017-01-13 01:43:45');
INSERT INTO `ms_brand` VALUES (29, '爱慕', '爱慕aimer', '内衣', '爱慕集团（以下简称“爱慕”）专业从事高端品牌内衣及服饰的设计、生产和营销，总部位于北京市朝阳区', 'www.aimer.com.cn', 0, '2017-01-13 01:46:06', '2017-01-13 01:46:06');
INSERT INTO `ms_brand` VALUES (30, '百丽', 'Belle', '鞋', 'Belle百丽是百丽国际推出的一款品牌。BeLLE百丽追求不同的生活体验及生活经历；都市环境不断在变，时装潮流不断在变，生活内容不断在变，女人在一生中的角色不断在变。BeLLE百丽在变化中展现出内在与外在的完美气质。Belle皮件简单分成女用与男用，内容包括皮包、皮带、皮夹、名片夹、旅行箱、皮件保养品等。百丽国际旗下百丽、天美意、他她、思加图等均在国内女鞋销量市场名列前茅，森达男鞋也备受消费者欢迎。', 'www.belle.com.cn', 0, '2017-01-13 01:48:20', '2017-01-13 01:48:20');
INSERT INTO `ms_brand` VALUES (31, '千百度', 'cbanner', '鞋', '品牌介绍cbanner千百度，一个富有文化和浪漫气息的时尚品牌，蕴含米兰时尚风潮，是美丽华实业公司旗下主打品牌之一。', 'www.c-banner.com', 0, '2017-01-13 01:49:35', '2017-01-13 01:49:35');
INSERT INTO `ms_brand` VALUES (32, '雅士', 'achette', '鞋', '雅氏,英文名称：achette 。始创于1968年，专注于高端休闲时尚鞋履的设计与制作。', 'http://www.arche-shoes.com.cn/', 0, '2017-01-13 01:50:43', '2017-01-13 01:50:43');
INSERT INTO `ms_brand` VALUES (33, '周大福', 'CHOW TAI FOOK', '珠宝', '周大福拥有广泛的零售网络,珠宝首饰与钟表零售点合共约2300 个。以下为附近的周大福旗舰店。 ', 'http://www.ctf.com.cn', 0, '2017-01-13 01:52:27', '2017-01-13 01:52:27');
INSERT INTO `ms_brand` VALUES (34, '周生生', 'chowsangsang', '珠宝', '周生生立足经典,创意不断,糅合现代设计灵感,呈现恒久时尚魅力的新颖杰作.「周而复始 生生不息」', 'http://cn.chowsangsang.com/', 0, '2017-01-13 01:53:10', '2017-01-13 01:53:10');
INSERT INTO `ms_brand` VALUES (35, '施华洛世奇', 'Swarovski', '珠宝', '1895年，来自波希米亚的发明家丹尼尔·施华洛世奇（Daniel Swarovski）以其远见卓识，携同他最新发明的仿水晶首饰石切割打磨机器，移居到奥地利泰利莱郡的华登斯市。自此，施华洛世奇开始在时尚世界中迸发火花', 'http://www.Swarovski.com/', 0, '2017-01-13 01:54:50', '2017-01-13 01:54:50');
INSERT INTO `ms_brand` VALUES (36, '小米', 'mi', '手机', '北京小米科技有限责任公司成立2010年4月，是一家专注于智能硬件和电子产品研发的移动互联网公司。“为发烧而生”是小米的产品概念。', 'mi.com', 0, '2017-01-13 01:57:31', '2017-01-13 01:57:31');
INSERT INTO `ms_brand` VALUES (37, '华为', 'HUAWEI', '电子信息', '华为手机隶属于华为消费者业务，作为华为三大核心业务之一，华为消费者业务始于2003年底，经过十余年的发展，在在中国、俄罗斯、德国、瑞典、印度及美国等地设立了16个研发中心', 'http://www.vmall.com/list-36', 0, '2017-01-13 02:04:11', '2017-01-13 02:04:11');
INSERT INTO `ms_brand` VALUES (38, '酷派', 'Coolpad', '电子信息', '酷派（Coolpad）是宇龙计算机通信科技（深圳）有限公司的手机品牌，创立于1993 年4月，是酷派集团有限公司（香港主板上市公司，股票代码 2369）的全资附属子公司', 'www.coolpad.com/', 0, '2017-01-13 02:05:13', '2017-01-13 02:05:13');
INSERT INTO `ms_brand` VALUES (39, '苹果', 'Apple', '电子信息', '苹果公司（Apple Inc. ）是美国的一家高科技公司。由史蒂夫·乔布斯、斯蒂夫·沃兹尼亚克和罗·韦恩(Ron Wayne)等人于1976年4月1日创立', 'www.apple.com/cn/', 0, '2017-01-13 02:05:53', '2017-01-13 02:05:53');
INSERT INTO `ms_brand` VALUES (40, '旺旺', '旺旺', '绿色食品、牛奶、小孩最爱', '旺旺公司之业务可追溯至台湾宜兰食品工业股份有限公司。旺旺公司于1992年正式投资大陆市场，是台湾第一个在大陆注册商标并且拥有最多注册商标的公司', 'www.wangwang.com', 0, '2017-01-13 03:21:24', '2017-01-13 03:21:24');
INSERT INTO `ms_brand` VALUES (41, '泸州老窖', '泸州老窖', '酒水', '泸州老窖(jiào)是中国最古老的四大名酒之一，“浓香鼻祖，酒中泰斗”，中国大型白酒上市公司（深交所股票代码000568）。其1573国宝窖池群1996年成为行业首家全国重点文物保护单位，传统酿制技艺2006年又入选首批国家级非物质文化遗产名录，世称“双国宝单位”', 'www.lzlj.com', 0, '2017-01-13 03:45:30', '2017-01-13 03:45:30');
INSERT INTO `ms_brand` VALUES (42, '雅顿第五大道', '雅顿第五大道', '雅顿第五大道', '香水', '香水', 0, '2017-01-13 04:52:34', '2017-01-13 04:52:34');
INSERT INTO `ms_brand` VALUES (43, '爱马仕', '爱马仕', '爱马仕', '香水', '香水', 0, '2017-01-13 04:53:46', '2017-01-13 04:53:46');
INSERT INTO `ms_brand` VALUES (44, 'Burberry巴宝莉', 'Burberry巴宝莉', 'Burberry巴宝莉', '香水', '香水', 0, '2017-01-13 04:54:25', '2017-01-13 04:54:25');
INSERT INTO `ms_brand` VALUES (45, 'Bvlgari Rose宝格丽', 'Bvlgari Rose宝格丽', 'Bvlgari Rose宝格丽', '香水', '香水', 0, '2017-01-13 04:55:10', '2017-01-13 04:55:10');

-- ----------------------------
-- Table structure for ms_cart
-- ----------------------------
DROP TABLE IF EXISTS `ms_cart`;
CREATE TABLE `ms_cart`  (
  `cart_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
  `member_id` int(11) NOT NULL COMMENT '会员编号',
  `goods_id` int(11) NULL DEFAULT NULL COMMENT '商品编号',
  `goods_num` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `choose` tinyint(4) NULL DEFAULT NULL COMMENT '是否选中',
  `amount` decimal(20, 2) NULL DEFAULT NULL COMMENT '金额',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`cart_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_cart
-- ----------------------------
INSERT INTO `ms_cart` VALUES (8, 5, 32, 2, 1, 19.80, '2016-11-22 06:22:50', '2016-12-06 02:40:38');
INSERT INTO `ms_cart` VALUES (9, 16, 31, 2, 1, 39.80, '2016-11-23 01:58:23', '2016-12-27 08:22:00');
INSERT INTO `ms_cart` VALUES (13, 16, 32, 2, 1, 19.80, '2016-12-29 03:44:47', '2016-12-29 03:45:51');

-- ----------------------------
-- Table structure for ms_goods
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods`;
CREATE TABLE `ms_goods`  (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '货号',
  `brief` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简介',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '描述',
  `price` decimal(20, 2) NOT NULL COMMENT '价格',
  `cost` decimal(20, 2) NOT NULL COMMENT '消费',
  `mktprice` decimal(20, 2) NOT NULL COMMENT '商品市场价',
  `mkt_enable` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否上架，0上，1不上',
  `cat_id` int(11) NOT NULL COMMENT '分类编号',
  `brand_id` int(11) NULL DEFAULT NULL COMMENT '品牌编号',
  `weight` decimal(20, 2) NOT NULL COMMENT '商品重量',
  `intro` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品详情图片',
  `params` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品参数',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `last_modify` timestamp(0) NOT NULL COMMENT '最后修改时间',
  `view_count` int(11) NULL DEFAULT NULL COMMENT '浏览次数',
  `buy_count` int(11) NULL DEFAULT NULL COMMENT '购买次数',
  `thumbnail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图',
  `big` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '大图',
  `small` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小图',
  `orinal` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原图',
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 94 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods
-- ----------------------------
INSERT INTO `ms_goods` VALUES (2, 'Burberry巴宝莉红粉恋歌女士香水', 'sp123456', 'Burberry出品的Brit Sheer（红粉恋歌）便如同一位高唱恋歌的少女。', '30/50/100ml气质优雅包邮', 280.00, 220.00, 300.00, 0, 29, 10, 200.00, '商品品牌	Hermes / 爱马仕', '{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}', '2019-04-22 14:16:51', '2017-01-05 09:05:26', 2, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (5, '正品Davidoff 大卫杜夫冷水女士淡香水2', 'sp123457', 'Cool Water（冷水）女士香水可以说是男用香水的一款延伸之作', '30/50/100ml气质优雅包邮', 89.00, 80.00, 90.00, 0, 29, 5, 300.00, '商品品牌  Davidoff/大卫杜夫', '{\"产地\":\"\\\"产地\\\":\\\"江苏\\\"\",\"功效\":\"\\\"净含量\\\":\\\"\\\"\",\"保质期\":\"\\\"保质期\\\":\\\"\\\"\",\"适合肤质\":\"\\\"口味\\\":\\\"\\\"\",\"规格类型\":\"\\\"配料\\\":\\\"\\\"\"}', '2019-04-23 15:37:08', '2017-01-05 09:05:23', 1, 0, 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_thum.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_big.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_small.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_orig.png');
INSERT INTO `ms_goods` VALUES (29, '旺旺 旺仔牛奶245ml*12罐 红罐8+绿罐4 新老包装交替', 'sn001', '旺旺 旺仔牛奶245ml*12罐 红罐8+绿罐4 新老包装交替', '旺旺 旺仔牛奶245ml*12罐 红罐8+绿罐4 新老包装交替', 38.00, 20.00, 40.00, 0, 62, 40, 2940.00, '<img src=\"/MobileShop/upload/kindeditor/image/96jz34UeExOINrY8Gg7lhQ==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/XNPsL+Rjx1mohoJ0Q7It8Q==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/0E15y6cphCLX5XKgeCECng==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/jlGl2dUtA2jQjS1h4jFJcw==.jpg\" alt=\"\" />', '{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}', '2019-04-22 14:26:57', '2017-01-13 03:27:01', 2, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (84, '泸州老窖六年陈头曲52度 浓香型白酒 整箱500ml*6瓶', 'sn002', '泸州老窖六年陈头曲52度 浓香型白酒 整箱500ml*6瓶', '泸州老窖六年陈头曲52度 浓香型白酒 整箱500ml*6瓶', 349.00, 200.00, 400.00, 0, 6, 2, 9300.00, '<img src=\"/MobileShop/upload/kindeditor/image/XnDb7JeYaFGlzSC7kvDUUQ==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/cQvQKHlnK4YvxjXaAl21Ag==.jpg\" alt=\"\" />', '{\"产地\":\"泸州\",\"储存方法\":\"密闭\",\"品种\":\"白酒\",\"净含量\":\"9300\",\"保质期\":\"十年\",\"配料\":\"\"}', '2019-04-22 14:22:22', '2017-01-13 03:52:09', 2, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (85, '雅顿第五大道香水女士持久淡香125ml正品代购包邮', 'sn003', '雅顿第五大道', '第五大道表达女性自信、现代以及智慧优雅的一面，适合现代都市中自信、时尚又追求个人风格的女性。是女孩们最经典的入门香水！注：此商品为新版包装，喷头是塑料喷头不是金属喷头哦~', 199.00, 120.00, 266.00, 0, 63, 42, 1000.00, '<p>\n	<br />\n</p>\n<p>\n	<img src=\"/MobileShop/upload/kindeditor/image/qJxQb3Vq8gS8skjncQ3OCw==.jpg\" alt=\"\" />\n</p>\n<p>\n	<img src=\"/MobileShop/upload/kindeditor/image/nz8Q5bPWC31H1dvM62MyGQ==.jpg\" alt=\"\" />\n</p>\n<p>\n	<img src=\"/MobileShop/upload/kindeditor/image/ePiRQ0detuYhc7k80T+4uA==.jpg\" alt=\"\" />\n</p>', '{\"产地\":\"美国\",\"适用人群\":\"任何人群\",\"香调\":\"花香调 东方香调\",\"规格\":\"125mL\",\"保质期\":\"3年\"}', '2019-04-22 14:22:24', '2017-01-13 06:15:31', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (86, '正品Hermes爱马仕尼罗河花园女士香水30/50/100ML超凡脱俗包邮', 'sn004', '正品Hermes爱马仕尼罗河花园女士香水30/50/100ML超凡脱俗包邮', '正品Hermes爱马仕尼罗河花园女士香水30/50/100ML超凡脱俗包邮', 265.00, 200.00, 300.00, 0, 63, 43, 300.00, '<img src=\"/MobileShop/upload/kindeditor/image/KIzQIb44OVjCaF8BQZYf+g==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/M0mNCEEXDrfcgvJHdV5BKA==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/XifuOStWPiQd40LSMadA2w==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/bd4b4kc9eLUA6MbJrKx1vg==.jpg\" alt=\"\" />', '{\"产地\":\"法国\",\"适用人群\":\"女士\",\"香调\":\"花果香调\",\"规格\":\"100mL\",\"保质期\":\"5年\"}', '2019-04-22 14:22:25', '2017-01-13 06:22:09', 1, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (87, '正品Bvlgari Omnia Amethyste 花舞轻盈女香65ML简装外盒包邮', 'sn005', '正品Bvlgari Omnia Amethyste 花舞轻盈女香65ML简装外盒包邮', '正品Bvlgari Omnia Amethyste 花舞轻盈女香65ML简装外盒包邮', 215.00, 130.00, 300.00, 0, 63, 45, 500.00, '<img src=\"/MobileShop/upload/kindeditor/image/pZ2ET+GkovAYo8uPooPkIw==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/DyWfOwn9JV0RfBRluVyrkw==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/kex57I7Al73JJjITKO14rw==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/XtKkP9TPWzYKaH3Av8E08g==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/4TuP840bD5ZlRPnq5DM5ag==.jpg\" alt=\"\" />', '{\"产地\":\"意大利\",\"适用人群\":\"女生\",\"香调\":\"花香调 树木香调\",\"规格\":\"65mL\",\"保质期\":\"5年\"}', '2019-04-22 14:22:29', '2017-01-13 06:29:09', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (88, '正品Bvlgari man宝格丽当代绅士男淡香30ml/60ml/100ml/150ml包邮', 'sn006', '正品Bvlgari man宝格丽当代绅士男淡香30ml/60ml/100ml/150ml包邮', '为创造出一种崭新、珍贵且充满活力的嗅觉体验，BVLGARI MAN散发出东方的白木香味，诠译出全新的男性典范。强烈的木质香气，令一向在男性香水中扮演传统元素的成分因加入自然纯净的微妙光采，变得更加出色。', 225.00, 130.00, 280.00, 0, 63, 45, 400.00, '<img src=\"/MobileShop/upload/kindeditor/image/tKWU3ZhZqb3OnOnHpOnTag==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/M5oN7aGQyjl8jk3wzlXmwg==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/L3J7wNjNx+m0xBn1XAHZkw==.jpg\" alt=\"\" />', '{\"产地\":\"意大利\",\"适用人群\":\"男士\",\"香调\":\"树木香调\",\"规格\":\"150mL\",\"保质期\":\"5年\"}', '2019-04-22 14:22:31', '2017-01-13 06:38:06', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (89, '正品Bvlgari Pour Homme宝格丽大吉岭茶中性香水30/50/100ML包邮', 'sn007', '正品Bvlgari Pour Homme宝格丽大吉岭茶中性香水30/50/100ML包邮', '在2006年，Bvlgari针对旗下的经典香水全面推出新改版，更加精緻的瓶身及外盒设计，更能显现出宝格丽的品牌精神！宝格丽大吉岭极緻中性香水，献给自然优雅、充满自信的你。无比魅力的秘密，就是沉稳而果决的风格与出人意表的性感。', 216.00, 180.00, 280.00, 0, 63, 45, 150.00, '<img src=\"/MobileShop/upload/kindeditor/image/V+JBV3kyZFlw6DRjjLMuNw==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/I9WsFDEeDKeXK7j4eoXBBw==.jpg\" alt=\"\" />', '{\"产地\":\"意大利\",\"适用人群\":\"男士\",\"香调\":\"花香调 树木香调\",\"规格\":\"65mL\",\"保质期\":\"5年\"}', '2019-04-22 14:22:32', '2017-01-13 06:43:56', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (90, '周大福珠宝十二生肖猴足金黄金吊坠(工费:48计价)F189132', 'sn008', '周大福珠宝十二生肖猴足金黄金吊坠(工费:48计价)F189132', '周大福珠宝十二生肖猴足金黄金吊坠(工费:48计价)F189132', 1232.00, 1000.00, 1300.00, 0, 46, 33, 4.00, '<img src=\"/MobileShop/upload/kindeditor/image/PDC4hRdiZnbw2nwGiGPlqQ==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/cOkWV7xG2STFguc3igoGTg==.jpg\" alt=\"\" />', '{\"产地\":\"周大福\",\"重量\":\"4\",\"贵重金属成分\":\"千足金\",\"售后服务\":\"专柜联保 店铺保修\",\"款式\":\"吊坠\"}', '2019-04-22 14:22:34', '2017-01-13 06:48:52', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (91, '周生生珠宝18K黄金钻石戒指钻戒女款首饰48926R', 'sn009', '周生生珠宝18K黄金钻石戒指钻戒女款首饰48926R', '周生生珠宝18K黄金钻石戒指钻戒女款首饰48926R', 1800.00, 1300.00, 2300.00, 0, 47, 34, 5.00, '<img src=\"/MobileShop/upload/kindeditor/image/a1zazmNRZTWiubdxEsrNjA==.jpg\" alt=\"\" /><img src=\"/MobileShop/upload/kindeditor/image/V+x9Hx25ZxuQxVf5LXF7Tw==.jpg\" alt=\"\" />', '{\"产地\":\"香港\",\"重量\":\"10分\",\"贵重金属成分\":\"钻石 黄18K金\",\"售后服务\":\"店铺保修\",\"款式\":\"戒指/指环\"}', '2019-04-22 14:22:42', '2017-01-13 06:54:22', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (92, 'Belle/百丽专柜同款牛皮男豆豆鞋懒人鞋驾车鞋男鞋3LQ01AM5', 'sn010', 'Belle/百丽专柜同款牛皮男豆豆鞋懒人鞋驾车鞋男鞋3LQ01AM5', 'Belle/百丽专柜同款牛皮男豆豆鞋懒人鞋驾车鞋男鞋3LQ01AM5', 320.00, 190.00, 360.00, 0, 42, 30, 300.00, '<h1 style=\"font-size:16px;font-family:&quot;background-color:#FFFFFF;\">\n	Belle/百丽专柜同款牛皮男豆豆鞋懒人鞋驾车鞋男鞋3LQ01AM5\n</h1>', '{\"产地\":\"中国大陆\",\"适合对象\":\"男士\",\"材质\":\"牛皮\",\"鞋跟\":\"无\",\"款式\":\"男士\"}', '2017-01-13 06:59:11', '2017-01-13 06:59:11', 0, 0, '', '', '', '');
INSERT INTO `ms_goods` VALUES (93, 'ochirly欧时力2016新女冬装时尚纯色立领宽松棉衣外套', 'sn011', 'ochirly欧时力2016新女冬装时尚纯色立领宽松棉衣外套', 'ochirly欧时力2016新女冬装时尚纯色立领宽松棉衣外套', 221.00, 100.00, 399.00, 0, 10, 4, 300.00, '<span style=\"color:#666666;font-family:Arial, &quot;font-size:16px;font-weight:bold;background-color:#FFFFFF;\">ochirly欧时力2016新女冬装时尚纯色立领宽松棉衣外套</span>', '{\"袖长\":\"57\",\"流行元素\":\"朋克\",\"风格\":\"大衣\",\"衣长\":\"60\"}', '2017-01-13 07:02:28', '2017-01-13 07:02:28', 0, 0, '', '', '', '');

-- ----------------------------
-- Table structure for ms_goods_cat
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_cat`;
CREATE TABLE `ms_goods_cat`  (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
  `parent_id` int(11) NULL DEFAULT NULL COMMENT '父分类编号，若有则填',
  `cat_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类路径，用来分别分类的位置',
  `goods_count` int(8) NULL DEFAULT NULL COMMENT '分类下包含得商品数量',
  `sort` int(5) NULL DEFAULT NULL COMMENT '排序，可以改变分类在首页显示得位置',
  `type_id` int(11) NOT NULL COMMENT '类型编号',
  `list_show` tinyint(4) NOT NULL COMMENT '是否显示，显示为0，不显示是1',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类的图片',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建分类的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改分类的时间',
  PRIMARY KEY (`cat_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 64 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_cat
-- ----------------------------
INSERT INTO `ms_goods_cat` VALUES (1, '饮料', 0, '0,1', 29, 5, 4, 0, '', '2019-09-08 03:48:15', '2016-09-08 03:48:15');
INSERT INTO `ms_goods_cat` VALUES (2, '果蔬饮料', 1, '0,1,1', 3, 0, 4, 0, '', '2019-04-15 19:00:59', '2016-09-08 03:50:27');
INSERT INTO `ms_goods_cat` VALUES (4, '茶饮料', 1, '0,1,2', 20, 1, 4, 0, '', '2019-04-15 19:01:01', '2016-09-09 07:12:21');
INSERT INTO `ms_goods_cat` VALUES (5, '酒水', 0, '0,2', 16, 0, 5, 0, '', '2019-04-16 13:29:10', '2019-04-16 01:07:25');
INSERT INTO `ms_goods_cat` VALUES (6, '白酒', 5, '0,2,1', 3, 0, 5, 0, '', '2019-04-15 19:01:07', '2016-10-25 03:06:51');
INSERT INTO `ms_goods_cat` VALUES (7, '啤酒', 5, '0,2,2', 13, 0, 5, 0, '', '2019-04-15 19:01:12', '2016-10-25 03:07:35');
INSERT INTO `ms_goods_cat` VALUES (9, '服装', 0, '0,3', 2, 0, 7, 0, '', '2019-04-16 13:29:07', '2019-04-16 03:31:01');
INSERT INTO `ms_goods_cat` VALUES (10, '女装', 9, '0,3,1', 1, 0, 7, 0, '', '2019-04-15 19:01:17', '2016-10-25 03:31:31');
INSERT INTO `ms_goods_cat` VALUES (11, '男装', 9, '0,3,2', 1, 0, 7, 0, '', '2019-04-15 19:01:26', '2016-10-25 03:31:58');
INSERT INTO `ms_goods_cat` VALUES (12, '童装', 9, '0,3,3', 0, 0, 7, 0, '', '2019-04-15 19:01:32', '2016-10-26 03:52:39');
INSERT INTO `ms_goods_cat` VALUES (28, '洗护用品', 0, '0,5', 0, 0, 27, 0, '', '2019-04-16 13:29:04', '2019-04-16 02:44:59');
INSERT INTO `ms_goods_cat` VALUES (29, '美妆', 0, '0,6', 5, 0, 22, 0, '', '2019-04-16 13:29:00', '2019-04-16 02:45:08');
INSERT INTO `ms_goods_cat` VALUES (35, '珠宝首饰', 0, '0,10', 2, 0, 23, 0, '', '2019-04-16 13:28:56', '2019-01-13 02:48:10');
INSERT INTO `ms_goods_cat` VALUES (36, '鞋', 0, '0,10', 1, 0, 24, 0, '', '2019-04-16 13:28:53', '2019-01-13 02:56:30');
INSERT INTO `ms_goods_cat` VALUES (37, '包', 0, '0,10', 0, 0, 28, 0, '', '2019-04-16 13:28:45', '2019-01-13 02:56:49');
INSERT INTO `ms_goods_cat` VALUES (38, '男包', 37, '0,10,1', 0, 0, 28, 0, '', '2017-01-13 02:58:58', '2017-01-13 02:58:58');
INSERT INTO `ms_goods_cat` VALUES (39, '女包', 37, '0,10,2', 0, 0, 28, 0, '', '2017-01-13 02:59:02', '2017-01-13 02:59:02');
INSERT INTO `ms_goods_cat` VALUES (40, '钱包', 37, '0,10,3', 0, 0, 28, 0, '', '2017-01-13 02:59:06', '2017-01-13 02:59:06');
INSERT INTO `ms_goods_cat` VALUES (41, '书包', 37, '0,10,4', 0, 0, 28, 0, '', '2017-01-13 02:59:13', '2017-01-13 02:59:13');
INSERT INTO `ms_goods_cat` VALUES (42, '男鞋', 36, '0,10,1', 1, 0, 24, 0, '', '2017-01-13 02:59:40', '2017-01-13 02:59:40');
INSERT INTO `ms_goods_cat` VALUES (43, '女鞋', 36, '0,10,2', 0, 0, 24, 0, '', '2017-01-13 02:59:46', '2017-01-13 02:59:46');
INSERT INTO `ms_goods_cat` VALUES (44, '童鞋', 36, '0,10,3', 0, 0, 24, 0, '', '2017-01-13 02:59:52', '2017-01-13 02:59:52');
INSERT INTO `ms_goods_cat` VALUES (45, '流行靴子', 36, '0,10,4', 0, 0, 24, 0, '', '2017-01-13 02:59:58', '2017-01-13 02:59:58');
INSERT INTO `ms_goods_cat` VALUES (46, '婚嫁黄金', 35, '0,10,1', 1, 0, 23, 0, '', '2017-01-13 03:00:38', '2017-01-13 03:00:38');
INSERT INTO `ms_goods_cat` VALUES (47, '钻石', 35, '0,10,2', 1, 0, 23, 0, '', '2017-01-13 03:00:59', '2017-01-13 03:00:59');
INSERT INTO `ms_goods_cat` VALUES (48, '时尚首饰', 35, '0,10,3', 0, 0, 23, 0, '', '2017-01-13 03:01:07', '2017-01-13 03:01:07');
INSERT INTO `ms_goods_cat` VALUES (49, '手表', 35, '0,10,4', 0, 0, 23, 0, '', '2017-01-13 03:01:12', '2017-01-13 03:01:12');
INSERT INTO `ms_goods_cat` VALUES (50, '电子产品', 0, '0,7', 0, 0, 25, 0, '', '2019-01-13 03:01:37', '2019-01-13 03:01:37');
INSERT INTO `ms_goods_cat` VALUES (51, '手机', 50, '0,7,1', 0, 0, 25, 0, '', '2017-01-13 03:01:53', '2017-01-13 03:01:53');
INSERT INTO `ms_goods_cat` VALUES (52, 'ipad', 50, '0,7,2', 0, 0, 25, 0, '', '2017-01-13 03:01:57', '2017-01-13 03:01:57');
INSERT INTO `ms_goods_cat` VALUES (53, '笔记本电脑', 50, '0,7,3', 0, 0, 25, 0, '', '2017-01-13 03:02:06', '2017-01-13 03:02:06');
INSERT INTO `ms_goods_cat` VALUES (54, '显示器', 50, '0,7,4', 0, 0, 25, 0, '', '2017-01-13 03:02:10', '2017-01-13 03:02:10');
INSERT INTO `ms_goods_cat` VALUES (55, '台式电脑', 50, '0,7,5', 0, 0, 25, 0, '', '2017-01-13 03:02:19', '2017-01-13 03:02:19');
INSERT INTO `ms_goods_cat` VALUES (56, '面膜', 29, '0,6,1', 0, 0, 22, 0, '', '2017-01-13 03:03:09', '2017-01-13 03:03:09');
INSERT INTO `ms_goods_cat` VALUES (57, '基础护理', 29, '0,6,2', 0, 0, 22, 0, '', '2017-01-13 03:03:15', '2017-01-13 03:03:15');
INSERT INTO `ms_goods_cat` VALUES (58, '彩妆', 29, '0,6,3', 0, 0, 22, 0, '', '2017-01-13 03:03:20', '2017-01-13 03:03:20');
INSERT INTO `ms_goods_cat` VALUES (59, '美发护发', 28, '0,5,1', 0, 0, 27, 0, '', '2017-01-13 03:05:02', '2017-01-13 03:05:02');
INSERT INTO `ms_goods_cat` VALUES (60, '沐浴身体护理', 28, '0,5,2', 0, 0, 27, 0, '', '2017-01-13 03:05:14', '2017-01-13 03:05:14');
INSERT INTO `ms_goods_cat` VALUES (61, '男士护理', 28, '0,5,3', 0, 0, 27, 0, '', '2017-01-13 03:05:20', '2017-01-13 03:05:20');
INSERT INTO `ms_goods_cat` VALUES (62, '牛奶', 1, '0,1,3', 1, 0, 4, 0, '', '2017-01-13 03:07:01', '2017-01-13 03:07:01');
INSERT INTO `ms_goods_cat` VALUES (63, '香水', 29, '0,6,4', 5, 0, 29, 0, '', '2017-01-13 04:57:12', '2017-01-13 04:57:12');

-- ----------------------------
-- Table structure for ms_goods_comment
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_comment`;
CREATE TABLE `ms_goods_comment`  (
  `comment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `order_id` int(11) NOT NULL COMMENT '订单编号',
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `member_id` int(11) NOT NULL COMMENT '会员编号',
  `score` tinyint(4) NOT NULL COMMENT '分数等级',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '评价内容',
  `isopen` tinyint(4) NOT NULL COMMENT '是否公开',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建评论时间',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_comment
-- ----------------------------
INSERT INTO `ms_goods_comment` VALUES (2, 3, 11, 16, 5, '非常好', 1, '2016-11-30 03:19:19');
INSERT INTO `ms_goods_comment` VALUES (3, 4, 29, 5, 5, '非常好', 1, '2016-11-30 03:20:37');
INSERT INTO `ms_goods_comment` VALUES (4, 5, 29, 16, 5, '很好', 1, '2016-11-30 03:48:09');
INSERT INTO `ms_goods_comment` VALUES (5, 7, 29, 16, 5, 'good', 1, '2016-11-30 03:48:43');
INSERT INTO `ms_goods_comment` VALUES (6, 3, 22, 16, 5, 'good', 1, '2016-12-27 09:02:04');

-- ----------------------------
-- Table structure for ms_goods_img
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_img`;
CREATE TABLE `ms_goods_img`  (
  `img_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品图片编号',
  `goods_id` int(11) NULL DEFAULT NULL COMMENT '商品编号',
  `thumbnail` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图\r\n            ',
  `big` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '大图',
  `small` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小图',
  `original` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '原图',
  `isdefault` smallint(6) NULL DEFAULT NULL COMMENT '是否为主图',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间\r\n            ',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`img_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品图片引用表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_img
-- ----------------------------
INSERT INTO `ms_goods_img` VALUES (1, 5, 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_thum.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_big.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_small.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_orig.png', 0, '2019-04-23 15:37:08', '2019-04-23 15:37:08');
INSERT INTO `ms_goods_img` VALUES (2, 5, 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_thum.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_big.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_small.png', 'D:/IdeaProjects/mobileshop/target/classes/static/uploadImg/PScXVgYYp6hOawippCCEtQ==_orig.png', 0, '2019-04-23 15:38:35', '2019-04-23 15:38:35');

-- ----------------------------
-- Table structure for ms_goods_like
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_like`;
CREATE TABLE `ms_goods_like`  (
  `like_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏编号',
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `member_id` int(11) NOT NULL COMMENT '会员编号',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建收藏的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改评论的时间',
  PRIMARY KEY (`like_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品收藏' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_like
-- ----------------------------
INSERT INTO `ms_goods_like` VALUES (1, 5, 5, '2019-04-23 09:33:17', '2019-04-23 09:33:17');

-- ----------------------------
-- Table structure for ms_goods_store
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_store`;
CREATE TABLE `ms_goods_store`  (
  `store_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '库存编号',
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `store` int(8) NOT NULL COMMENT '库存数量',
  `enable_store` int(8) NOT NULL COMMENT '可用库存',
  `operate_type` tinyint(4) NOT NULL COMMENT '库存操作类型',
  `intime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '入库时间',
  `outtime` timestamp(0) NOT NULL COMMENT '出库时间',
  PRIMARY KEY (`store_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '库存表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_store
-- ----------------------------
INSERT INTO `ms_goods_store` VALUES (2, 2, 100, 100, 0, '2019-04-23 10:58:07', '2016-09-09 09:18:00');
INSERT INTO `ms_goods_store` VALUES (3, 4, 20, 19, 0, '2016-11-08 08:14:41', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (4, 5, 100, 95, 0, '2016-11-08 08:31:45', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (5, 20, 100, 100, 0, '2016-11-07 08:26:57', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (6, 32, 50, 50, 0, '2016-11-18 03:56:10', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (7, 11, 20, 20, 0, '2016-11-18 09:17:43', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (8, 31, 40, 40, 0, '2016-12-28 09:02:28', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (9, 47, 45, 45, 0, '2017-01-11 08:07:41', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (10, 48, 23, 23, 0, '2017-01-11 08:13:10', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (11, 49, 34, 34, 0, '2017-01-11 08:21:18', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (12, 50, 45, 45, 0, '2017-01-11 08:23:27', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (13, 51, 45, 45, 0, '2017-01-12 00:50:51', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (14, 52, 56, 56, 0, '2017-01-12 01:00:19', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (15, 53, 78, 78, 0, '2017-01-12 01:07:53', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (16, 54, 89, 89, 0, '2017-01-12 01:09:26', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (17, 55, 88, 88, 0, '2017-01-12 02:19:02', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (18, 56, 77, 77, 0, '2017-01-12 02:20:20', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (19, 57, 90, 90, 0, '2017-01-12 02:23:41', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (20, 58, 66, 66, 0, '2017-01-12 02:28:18', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (21, 59, 52, 52, 0, '2017-01-12 02:31:58', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (22, 60, 50, 50, 0, '2017-01-12 02:38:44', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (23, 61, 88, 88, 0, '2017-01-12 02:40:50', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (24, 62, 6, 6, 0, '2017-01-12 02:44:25', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (25, 63, 33, 33, 0, '2017-01-12 02:47:41', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (26, 64, 5, 5, 0, '2017-01-12 03:01:45', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (27, 65, 4, 4, 0, '2017-01-12 03:03:15', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (28, 66, 52, 52, 0, '2017-01-12 03:05:45', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (29, 67, 2, 2, 0, '2017-01-12 03:10:57', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (30, 68, 2121, 2121, 0, '2017-01-12 03:12:03', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (31, 69, 333, 333, 0, '2017-01-12 03:13:25', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (32, 70, 56, 56, 0, '2017-01-12 03:18:49', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (33, 71, 23, 23, 0, '2017-01-12 03:21:14', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (34, 74, 56, 56, 0, '2017-01-12 03:48:07', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (35, 75, 333, 333, 0, '2017-01-12 03:49:45', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (36, 76, 33, 33, 0, '2017-01-12 03:51:46', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (37, 77, 333, 333, 0, '2017-01-12 03:52:52', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (38, 78, 44, 44, 0, '2017-01-12 03:57:59', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (39, 79, 3322, 3322, 0, '2017-01-12 05:03:05', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (40, 80, 5000, 5000, 0, '2017-01-12 06:21:22', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (41, 81, 34, 34, 0, '2017-01-12 06:27:01', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (42, 82, 20, 20, 0, '2017-01-12 06:28:32', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (43, 83, 5000, 5000, 0, '2017-01-13 03:27:28', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (44, 84, 500, 500, 0, '2017-01-13 03:52:49', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (45, 85, 577, 577, 0, '2017-01-13 06:15:53', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (46, 86, 400, 400, 0, '2017-01-13 06:22:33', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (47, 87, 600, 600, 0, '2017-01-13 06:29:25', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (48, 88, 700, 700, 0, '2017-01-13 06:38:29', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (49, 89, 88, 88, 0, '2017-01-13 06:44:27', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (50, 90, 1000, 1000, 0, '2017-01-13 06:49:18', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (51, 91, 30, 30, 0, '2017-01-13 06:54:45', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (52, 92, 23, 23, 0, '2017-01-13 06:59:16', '2019-04-16 18:57:35');
INSERT INTO `ms_goods_store` VALUES (53, 93, 500, 500, 0, '2017-01-13 07:02:33', '2019-04-16 18:57:35');

-- ----------------------------
-- Table structure for ms_goods_type
-- ----------------------------
DROP TABLE IF EXISTS `ms_goods_type`;
CREATE TABLE `ms_goods_type`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `params` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '类型参数',
  `disabled` tinyint(4) NULL DEFAULT NULL COMMENT '是否可用',
  `is_physical` tinyint(4) NULL DEFAULT NULL COMMENT '是否是实体商品',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建类型的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改类型的时间',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品类型表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_goods_type
-- ----------------------------
INSERT INTO `ms_goods_type` VALUES (4, '饮料', '{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}', 0, 0, '2016-09-07 09:23:20', '2016-10-17 08:15:28');
INSERT INTO `ms_goods_type` VALUES (5, '酒水', '{\"产地\":\"\",\"储存方法\":\"\",\"品种\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"配料\":\"\"}', 0, 0, '2016-09-07 09:25:26', '2016-09-07 09:25:26');
INSERT INTO `ms_goods_type` VALUES (7, '女装', '{\"袖长\":\"\",\"流行元素\":\"\",\"风格\":\"\",\"衣长\":\"\"}', 0, 0, '2016-10-14 02:01:10', '2016-10-14 02:01:10');
INSERT INTO `ms_goods_type` VALUES (14, '服装', '{\"袖长\":\"\",\"流行元素\":\"\",\"风格\":\"\",\"衣长\":\"\"}', 0, 0, '2016-11-11 07:24:09', '2016-11-11 07:25:01');
INSERT INTO `ms_goods_type` VALUES (16, '饮料test2', '{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}', 0, 0, '2016-11-18 01:25:11', '2016-11-18 01:25:11');
INSERT INTO `ms_goods_type` VALUES (17, '饮料test3', '{\"产地\":\"\",\"净含量\":\"\",\"保质期\":\"\",\"口味\":\"\"}', 0, 0, '2016-11-18 01:56:31', '2016-11-18 01:56:31');
INSERT INTO `ms_goods_type` VALUES (18, 'testfz', '{\"袖长\":\"\",\"流行元素\":\"\",\"风格\":\"\",\"衣长\":\"\"}', 0, 0, '2016-11-18 03:19:19', '2016-11-18 03:19:43');
INSERT INTO `ms_goods_type` VALUES (21, '测试', '{\"1\":\"\",\"2\":\"\",\"3\":\"\",\"4\":\"\",\"5\":\"\"}', 0, 0, '2016-12-28 09:22:15', '2016-12-28 09:22:15');
INSERT INTO `ms_goods_type` VALUES (22, '化妆品', '{\"产地\":\"\",\"功效\":\"\",\"保质期\":\"\",\"适合肤质\":\"\",\"规格类型\":\"\"}', 0, 0, '2017-01-13 02:17:43', '2017-01-13 02:17:43');
INSERT INTO `ms_goods_type` VALUES (23, '珠宝', '{\"产地\":\"\",\"重量\":\"\",\"贵重金属成分\":\"\",\"售后服务\":\"\",\"款式\":\"\"}', 0, 0, '2017-01-13 02:19:47', '2017-01-13 02:19:47');
INSERT INTO `ms_goods_type` VALUES (24, '鞋', '{\"产地\":\"\",\"适合对象\":\"\",\"材质\":\"\",\"鞋跟\":\"\",\"款式\":\"\"}', 0, 0, '2017-01-13 02:20:58', '2017-01-13 02:20:58');
INSERT INTO `ms_goods_type` VALUES (25, '电子产品', '{\"机身颜色\":\"\",\"品牌\":\"\",\"型号\":\"\",\"规格\":\"\",\"证书编号\":\"\"}', 0, 0, '2017-01-13 02:23:48', '2017-01-13 02:23:48');
INSERT INTO `ms_goods_type` VALUES (26, ' 食品', '{\"产地\":\"\",\"配料表\":\"\",\"食品口味\":\"\",\"存储方式\":\"\",\"净含量\":\"\"}', 0, 0, '2017-01-13 02:29:26', '2017-01-13 02:29:26');
INSERT INTO `ms_goods_type` VALUES (27, ' 洗护用品', '{\"产地\":\"\",\"功效\":\"\",\"适用人群\":\"\",\"净含量\":\"\",\"保质期\":\"\"}', 0, 0, '2017-01-13 02:34:39', '2017-01-13 02:34:39');
INSERT INTO `ms_goods_type` VALUES (28, '包', '{\"产地\":\"\",\"颜色\":\"\",\"材质\":\"\",\"适用人群\":\"\",\"款式\":\"\"}', 0, 0, '2017-01-13 02:47:30', '2017-01-13 02:47:30');
INSERT INTO `ms_goods_type` VALUES (29, '香水', '{\"产地\":\"\",\"适用人群\":\"\",\"香调\":\"\",\"规格\":\"\",\"保质期\":\"\"}', 0, 0, '2017-01-13 04:48:46', '2017-01-13 04:48:46');

-- ----------------------------
-- Table structure for ms_logi
-- ----------------------------
DROP TABLE IF EXISTS `ms_logi`;
CREATE TABLE `ms_logi`  (
  `logi_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '物流编号',
  `ship_id` int(11) NOT NULL COMMENT '货运公司编号',
  `sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流单号',
  `carriage` decimal(20, 2) NULL DEFAULT NULL COMMENT '运费',
  `sender` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '送货人\r\n            ',
  `status` smallint(6) NULL DEFAULT NULL COMMENT '状态',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`logi_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物流表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_logi
-- ----------------------------
INSERT INTO `ms_logi` VALUES (2, 2, '20161125001', 0.00, '张三', 2, '2016-11-25 03:25:57', '2016-11-25 03:26:36');
INSERT INTO `ms_logi` VALUES (4, 3, 'yt20161202008', 8.00, '李四', 2, '2016-11-25 06:28:26', '2016-12-02 01:53:34');
INSERT INTO `ms_logi` VALUES (5, 7, 'sf20161206008', 8.00, '赵柳柳', 1, '2016-12-06 02:03:51', '2016-12-06 02:08:40');
INSERT INTO `ms_logi` VALUES (6, 0, '', 8.00, '', 0, '2016-12-06 02:04:15', '2016-12-06 02:04:15');

-- ----------------------------
-- Table structure for ms_member
-- ----------------------------
DROP TABLE IF EXISTS `ms_member`;
CREATE TABLE `ms_member`  (
  `member_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员编号',
  `uname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会员用户名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会员密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会员邮箱',
  `sex` smallint(6) NULL DEFAULT NULL COMMENT '会员性别',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员电话',
  `regtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '会员注册时间',
  `lastlogin` timestamp(0) NOT NULL COMMENT '会员上次登录时间',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员头像',
  PRIMARY KEY (`member_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 44 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_member
-- ----------------------------
INSERT INTO `ms_member` VALUES (3, 'ww', '123456', 'ww@qq.com', 1, '13643219876', '2016-09-07 06:32:50', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (5, 'zs', 'gdyb21LQTcIANtvYMT7QVQ==', 'zs@qq.com', 1, '13345678765', '2016-10-09 07:41:56', '2019-04-16 18:58:40', 'http://192.168.8.7:8080/MobileShop/upload/YfmswqjQUrxbm2KqOHmN1A==_member.jpg');
INSERT INTO `ms_member` VALUES (6, '赵六', 'ICy5YqxZB1uWSwcVLSNLcA==', 'zl@qq.com', 0, '', '2016-10-09 07:42:53', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (16, 'test', '4QrcOUm6Wau+VuBX8g+IPg==', 'test@qq.com', 0, '', '2016-10-10 03:21:28', '2016-12-29 03:45:18', 'http://192.168.8.7:8080/MobileShop/upload/RFR5X19/xA6DLGEhJF9v+A==_member.jpg');
INSERT INTO `ms_member` VALUES (19, 'test222', 'ICy5YqxZB1uWSwcVLSNLcA==', 'test1@qq.com', 1, '13245678765', '2016-10-10 07:14:23', '2016-10-10 09:09:13', '');
INSERT INTO `ms_member` VALUES (20, 'test2', 'ICy5YqxZB1uWSwcVLSNLcA==', 'test2@qq.com', 0, '', '2016-10-11 01:33:05', '2016-10-12 07:40:16', '');
INSERT INTO `ms_member` VALUES (22, 'zhangsan', '4QrcOUm6Wau+VuBX8g+IPg==', 'aa@qq.com', 0, '', '2016-10-12 03:39:03', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (23, 'lisi', '4QrcOUm6Wau+VuBX8g+IPg==', 'aaa@qq.com', 0, '', '2016-10-13 02:00:09', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (24, 'test3', 'ICy5YqxZB1uWSwcVLSNLcA==', 'test3@qq.com', 0, '', '2016-10-13 02:16:24', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (25, '李四', 'ICy5YqxZB1uWSwcVLSNLcA==', 'ls@qq.com', 0, '', '2016-10-27 08:48:02', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (26, '李四2', 'ICy5YqxZB1uWSwcVLSNLcA==', 'ls2@qq.com', 0, '', '2016-10-27 08:57:17', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (27, 'zhusheng', '4QrcOUm6Wau+VuBX8g+IPg==', 'zhusheng@123.com', 0, '', '2016-10-27 09:04:47', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (30, '张思思', 'ICy5YqxZB1uWSwcVLSNLcA==', 'zsss@qq.com', 0, '', '2016-10-28 01:48:46', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (31, '朱胜12134', '4QrcOUm6Wau+VuBX8g+IPg==', 'zhusheng@12134.com', 0, '', '2016-11-01 02:16:47', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (33, 'testzry', 'WaiQjYYk5lhiw6h6xd/vhA==', '448966073@qq.com', 0, '', '2016-11-04 09:13:02', '2019-04-16 18:58:40', '');
INSERT INTO `ms_member` VALUES (36, 'testtt', '1B2M2Y8AsgTpgAmY7PhCfg==', 'test2222@qq.com', 0, '', '2019-04-23 11:21:39', '2019-04-23 11:21:39', '');
INSERT INTO `ms_member` VALUES (37, 'zyb', '4QrcOUm6Wau+VuBX8g+IPg==', '123456@gmail.com', 0, '', '2019-06-21 09:20:26', '2019-06-21 09:20:26', '');
INSERT INTO `ms_member` VALUES (42, 'zzzz', '4QrcOUm6Wau+VuBX8g+IPg==', 'zzzz@qq.com', 0, '', '2019-06-21 16:08:46', '2019-06-21 16:08:47', '');
INSERT INTO `ms_member` VALUES (43, 'qqqq', '4QrcOUm6Wau+VuBX8g+IPg==', '123456@qq.com', 0, '', '2019-06-21 16:08:31', '2019-06-21 16:08:31', '');

-- ----------------------------
-- Table structure for ms_member_address
-- ----------------------------
DROP TABLE IF EXISTS `ms_member_address`;
CREATE TABLE `ms_member_address`  (
  `address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会员收货地址编号',
  `member_id` int(11) NOT NULL COMMENT '会员编号',
  `province` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员收货地址所在省',
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员收货地址所在市',
  `region` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员收货地址所在区',
  `addr` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '收货人地址',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系电话',
  `receiver` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人姓名',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会员收货地址表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_member_address
-- ----------------------------
INSERT INTO `ms_member_address` VALUES (3, 16, '广东省', '深圳市', '南山区', '西丽', '13976543198', '李诗诗', '2016-09-07 06:36:21', '2016-09-07 06:36:21');
INSERT INTO `ms_member_address` VALUES (4, 16, '黑龙江省', '哈尔滨市', '南岗区', '南岗', '13576319854', '李思思', '2016-09-07 06:37:43', '2016-09-07 06:37:43');
INSERT INTO `ms_member_address` VALUES (5, 16, '广东省', '深圳市', '罗湖区', '罗湖体育馆', '13598763154', '张丽丽', '2016-09-07 06:39:01', '2016-09-07 06:39:01');
INSERT INTO `ms_member_address` VALUES (6, 16, '黑龙江省', '哈尔滨市', '道里区', '和平路', '13971986543', '李素素', '2016-09-07 06:40:18', '2016-09-07 06:40:18');
INSERT INTO `ms_member_address` VALUES (7, 16, '黑龙江省', '哈尔滨市', '道里区', '和平路', '13598763154', '张丽丽', '2016-09-07 06:40:57', '2016-09-07 06:40:57');
INSERT INTO `ms_member_address` VALUES (8, 16, '湖北省', '武汉市', '武昌区', '武昌', '13598763154', '张丹丹', '2016-09-07 06:41:45', '2016-09-07 06:41:45');
INSERT INTO `ms_member_address` VALUES (9, 3, '湖北省', '武汉市', '汉阳区', '汉阳', '13376315498', '王舞舞', '2016-09-07 06:43:06', '2016-09-07 06:43:06');
INSERT INTO `ms_member_address` VALUES (16, 3, '广东省', '深圳市', '龙岗区', '坂田', '13923456789', '王双双', '2016-10-12 08:59:22', '2016-10-12 09:09:55');
INSERT INTO `ms_member_address` VALUES (17, 3, '广东省', '深圳市', '罗湖区', '国贸', '13567892345', '王爽', '2016-10-12 09:22:49', '2016-10-12 09:22:49');
INSERT INTO `ms_member_address` VALUES (18, 16, '广东省', '深圳市', '罗湖区', '坂田', '18575593069', '王飒', '2019-04-16 19:01:30', '2016-10-27 07:34:52');
INSERT INTO `ms_member_address` VALUES (28, 3, '广东省', '深圳市', '罗湖区', '', '13489765432', 'jack', '2019-04-16 19:00:56', '2016-10-27 08:43:58');
INSERT INTO `ms_member_address` VALUES (29, 16, '广东省', '深圳市', '罗湖区', '坂田', '18575593069', '苏打水', '2019-04-16 19:01:38', '2016-10-27 08:47:37');
INSERT INTO `ms_member_address` VALUES (30, 16, '广东省', '深圳市', '罗湖区', '坂田', '18575593069', '十分多', '2019-04-16 19:01:51', '2016-10-27 08:55:23');
INSERT INTO `ms_member_address` VALUES (31, 5, '广西省', '桂林市', '桂林', '', '19867894532', '张珊珊', '2016-11-24 00:49:16', '2016-11-24 00:49:16');
INSERT INTO `ms_member_address` VALUES (32, 5, '广东省', '深圳市', '龙岗区', '坂田', '18945368765', '张思思', '2016-12-29 01:28:40', '2016-12-29 01:28:40');

-- ----------------------------
-- Table structure for ms_order
-- ----------------------------
DROP TABLE IF EXISTS `ms_order`;
CREATE TABLE `ms_order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `member_id` int(11) NULL DEFAULT NULL COMMENT '会员编号',
  `status` smallint(6) NULL DEFAULT NULL COMMENT '订单状态',
  `payment_id` int(11) NULL DEFAULT NULL COMMENT '支付编号',
  `logi_id` int(11) NULL DEFAULT NULL COMMENT '物流编号',
  `total_amount` decimal(20, 2) NULL DEFAULT NULL COMMENT '总金额',
  `address_id` char(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '会员收货地址编号',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建订单的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_order
-- ----------------------------
INSERT INTO `ms_order` VALUES (3, '70dc236b89d940e69a3efe82fd21613a', 16, 3, 2, 2, 139.10, '3', '2016-11-24 00:39:03', '2016-11-24 00:39:03');
INSERT INTO `ms_order` VALUES (4, 'd98085536e044a209bf489d127043da0', 5, 4, 0, 0, 9.90, '31', '2016-11-24 00:50:24', '2016-11-24 00:50:24');
INSERT INTO `ms_order` VALUES (5, 'e86e292b639a458e864661b2a15eb978', 16, 4, 0, 0, 29.70, '3', '2016-11-24 08:19:22', '2016-11-24 08:19:22');
INSERT INTO `ms_order` VALUES (7, '7ef937daa5794191bc94f86fa68e0229', 16, 3, 4, 4, 27.80, '3', '2016-11-25 06:28:26', '2016-11-25 06:28:26');
INSERT INTO `ms_order` VALUES (8, '32458ba7edd0494ba08c00855d5d58b8', 16, 4, 0, 0, 57.50, '6', '2016-12-02 08:22:24', '2016-12-02 08:22:24');
INSERT INTO `ms_order` VALUES (9, '6aa7499f045845669ee65771d5901f16', 16, 3, 5, 5, 55.76, '4', '2016-12-06 02:03:51', '2016-12-06 02:03:51');
INSERT INTO `ms_order` VALUES (10, 'a1577b2052364d19acdbc56d220d05f4', 5, 0, 6, 6, 79.64, '31', '2016-12-06 02:04:15', '2016-12-06 02:04:15');

-- ----------------------------
-- Table structure for ms_order_goods
-- ----------------------------
DROP TABLE IF EXISTS `ms_order_goods`;
CREATE TABLE `ms_order_goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `order_id` int(11) NULL DEFAULT NULL COMMENT '订单编号',
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `goods_num` int(11) NOT NULL COMMENT '商品数量',
  `price` decimal(20, 2) NULL DEFAULT NULL COMMENT '商品单价',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_order_goods
-- ----------------------------
INSERT INTO `ms_order_goods` VALUES (2, 3, 11, 4, 9.90);
INSERT INTO `ms_order_goods` VALUES (3, 3, 22, 5, 19.90);
INSERT INTO `ms_order_goods` VALUES (4, 4, 29, 1, 9.90);
INSERT INTO `ms_order_goods` VALUES (5, 5, 29, 3, 9.90);
INSERT INTO `ms_order_goods` VALUES (7, 7, 29, 2, 9.90);
INSERT INTO `ms_order_goods` VALUES (8, 8, 32, 5, 9.90);
INSERT INTO `ms_order_goods` VALUES (9, 9, 4, 2, 23.88);
INSERT INTO `ms_order_goods` VALUES (10, 10, 5, 3, 23.88);

-- ----------------------------
-- Table structure for ms_order_log
-- ----------------------------
DROP TABLE IF EXISTS `ms_order_log`;
CREATE TABLE `ms_order_log`  (
  `log_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `order_id` int(11) NOT NULL COMMENT '订单编号',
  `status` int(11) NULL DEFAULT NULL COMMENT '订单状态',
  `time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间',
  PRIMARY KEY (`log_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单日志表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_order_log
-- ----------------------------
INSERT INTO `ms_order_log` VALUES (2, 3, 0, '2016-11-24 00:39:03');
INSERT INTO `ms_order_log` VALUES (3, 4, 0, '2016-11-24 00:50:24');
INSERT INTO `ms_order_log` VALUES (4, 5, 0, '2016-11-24 08:19:22');
INSERT INTO `ms_order_log` VALUES (6, 7, 0, '2016-11-25 06:28:26');
INSERT INTO `ms_order_log` VALUES (7, 7, 1, '2016-12-02 01:14:32');
INSERT INTO `ms_order_log` VALUES (8, 7, 2, '2016-12-02 01:53:34');
INSERT INTO `ms_order_log` VALUES (9, 7, 3, '2016-12-02 01:54:44');
INSERT INTO `ms_order_log` VALUES (10, 4, 4, '2016-12-02 06:33:11');
INSERT INTO `ms_order_log` VALUES (11, 5, 4, '2016-12-02 06:40:03');
INSERT INTO `ms_order_log` VALUES (12, 3, 3, '2016-12-02 08:08:29');
INSERT INTO `ms_order_log` VALUES (13, 8, 0, '2016-12-02 08:22:24');
INSERT INTO `ms_order_log` VALUES (14, 8, 4, '2016-12-02 08:23:32');
INSERT INTO `ms_order_log` VALUES (15, 9, 0, '2016-12-06 02:03:51');
INSERT INTO `ms_order_log` VALUES (16, 10, 0, '2016-12-06 02:04:15');
INSERT INTO `ms_order_log` VALUES (17, 9, 1, '2016-12-06 02:05:44');
INSERT INTO `ms_order_log` VALUES (18, 9, 2, '2016-12-06 02:08:40');
INSERT INTO `ms_order_log` VALUES (19, 9, 3, '2016-12-06 02:29:30');

-- ----------------------------
-- Table structure for ms_payment
-- ----------------------------
DROP TABLE IF EXISTS `ms_payment`;
CREATE TABLE `ms_payment`  (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '支付编号',
  `sn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付号',
  `paytype_id` int(11) NULL DEFAULT NULL COMMENT '支付类型编号',
  `amount` decimal(20, 2) NULL DEFAULT NULL COMMENT '金额',
  `status` smallint(6) NULL DEFAULT NULL COMMENT '支付状态',
  `paytime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '支付时间\r\n            ',
  `remark` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '备注',
  PRIMARY KEY (`payment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支付表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_payment
-- ----------------------------
INSERT INTO `ms_payment` VALUES (2, '16148004259122571', 1, 139.10, 1, '2016-11-25 02:56:31', '');
INSERT INTO `ms_payment` VALUES (4, '16148005530634416', 1, 27.80, 1, '2016-12-02 01:14:32', '');
INSERT INTO `ms_payment` VALUES (5, '1614809898313933', 1, 55.76, 1, '2016-12-06 02:05:44', '');
INSERT INTO `ms_payment` VALUES (6, '5148098985525455', 1, 79.64, 0, '2016-12-06 02:04:15', '');

-- ----------------------------
-- Table structure for ms_paytype
-- ----------------------------
DROP TABLE IF EXISTS `ms_paytype`;
CREATE TABLE `ms_paytype`  (
  `paytype_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '支付类型编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '支付类型名称',
  `config` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '配置',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '支付类型描述',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建支付类型时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`paytype_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支付类型表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_paytype
-- ----------------------------
INSERT INTO `ms_paytype` VALUES (1, '支付宝', '', '支付宝（中国）网络技术有限公司是国内领先的第三方支付平台，致力于提供“简单、安全、快速”的支付解决方案。', '2016-11-23 02:15:31', '2016-11-23 02:15:31');
INSERT INTO `ms_paytype` VALUES (2, '微信', '微信', '微信', '2016-11-23 02:16:06', '2017-01-06 03:46:05');
INSERT INTO `ms_paytype` VALUES (6, '快钱', '', '快钱', '2016-11-23 02:48:41', '2016-11-23 03:01:47');

-- ----------------------------
-- Table structure for ms_role
-- ----------------------------
DROP TABLE IF EXISTS `ms_role`;
CREATE TABLE `ms_role`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_role
-- ----------------------------
INSERT INTO `ms_role` VALUES (1, '超级管理员', '拥有所有权限', '2016-11-30 07:37:32', '2017-01-06 03:47:54');
INSERT INTO `ms_role` VALUES (2, '商品管理员', '管理商品列表、类型列表、分类列表、品牌列表等', '2016-11-30 07:39:03', '2016-11-30 07:39:03');
INSERT INTO `ms_role` VALUES (3, '订单管理员', '管理订单列表、货运公司列表等', '2016-11-30 07:40:01', '2016-11-30 07:40:01');

-- ----------------------------
-- Table structure for ms_ship
-- ----------------------------
DROP TABLE IF EXISTS `ms_ship`;
CREATE TABLE `ms_ship`  (
  `ship_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '货运公司编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '货运公司名称',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公司代码',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间\r\n            ',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ship_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '货运公司表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_ship
-- ----------------------------
INSERT INTO `ms_ship` VALUES (2, '申通快递', 'shentong', '2016-11-22 07:13:39', '2016-11-22 07:50:00', NULL);
INSERT INTO `ms_ship` VALUES (3, '圆通快递', 'yuantong', '2016-11-22 07:14:04', '2016-11-22 08:08:57', NULL);
INSERT INTO `ms_ship` VALUES (6, '韵达快递', 'ydkd', '2016-11-22 07:35:05', '2016-11-22 07:35:05', NULL);
INSERT INTO `ms_ship` VALUES (7, '顺丰速运', 'sfsy', '2016-11-22 07:36:09', '2016-11-22 07:36:09', NULL);
INSERT INTO `ms_ship` VALUES (8, '跨越速运', 'kuayue', '2016-11-22 08:07:24', '2016-11-22 08:07:24', NULL);
INSERT INTO `ms_ship` VALUES (9, '天天快递', 'ttkd', '2016-11-24 00:42:54', '2017-01-06 03:48:52', NULL);

-- ----------------------------
-- Table structure for ms_tag
-- ----------------------------
DROP TABLE IF EXISTS `ms_tag`;
CREATE TABLE `ms_tag`  (
  `tag_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '标签编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标签名称',
  `type` tinyint(4) NOT NULL COMMENT '标签类型,0:商品标签，1：品牌标签',
  `count` int(11) NOT NULL COMMENT '标签下商品/品牌下数量',
  `sort` smallint(6) NULL DEFAULT NULL COMMENT '排序，可以改变标签在分组中得显示位置',
  `team` tinyint(4) NOT NULL,
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建标签的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改标签的时间',
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '标签表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_tag
-- ----------------------------
INSERT INTO `ms_tag` VALUES (2, '本周热卖', 0, 5, 1, 1, '2016-09-08 06:30:59', '2016-09-08 06:30:59');
INSERT INTO `ms_tag` VALUES (3, '商家推荐', 0, 5, 0, 1, '2016-09-08 06:31:29', '2016-09-08 06:31:29');
INSERT INTO `ms_tag` VALUES (4, '品牌1', 1, 6, 0, 0, '2016-09-08 06:37:53', '2016-09-09 07:34:44');
INSERT INTO `ms_tag` VALUES (6, '特别推荐', 0, 6, 0, 0, '2016-11-01 06:32:19', '2016-11-01 06:32:19');
INSERT INTO `ms_tag` VALUES (7, '猜你喜欢', 0, 6, 0, 0, '2016-11-01 06:40:56', '2016-11-01 06:40:56');
INSERT INTO `ms_tag` VALUES (8, '新品上市', 0, 6, 0, 0, '2016-11-01 07:04:37', '2016-11-01 07:04:37');
INSERT INTO `ms_tag` VALUES (9, '疯狂抢购', 0, 6, 0, 0, '2016-11-01 07:04:56', '2016-11-01 07:04:56');
INSERT INTO `ms_tag` VALUES (10, '销售热卖', 0, 6, 0, 0, '2016-11-01 07:05:15', '2016-11-01 07:05:15');
INSERT INTO `ms_tag` VALUES (11, '休闲零食', 0, 8, 0, 1, '2016-11-01 07:07:10', '2016-11-01 07:07:10');
INSERT INTO `ms_tag` VALUES (12, '饮料', 0, 8, 0, 1, '2016-11-01 07:07:43', '2016-11-01 07:07:43');
INSERT INTO `ms_tag` VALUES (13, '酒水', 0, 8, 0, 1, '2016-11-01 07:07:54', '2016-11-01 07:07:54');
INSERT INTO `ms_tag` VALUES (14, '糖果', 0, 8, 0, 1, '2016-11-01 07:08:29', '2016-11-01 07:08:29');
INSERT INTO `ms_tag` VALUES (15, '品牌', 1, 18, 0, 1, '2016-11-03 07:01:04', '2016-11-03 07:01:04');
INSERT INTO `ms_tag` VALUES (17, '品牌标签测试', 1, 18, 2, 2, '2016-11-03 07:59:55', '2017-01-06 03:53:04');
INSERT INTO `ms_tag` VALUES (18, '郑氏标签', 0, 1, 0, 2, '2019-04-22 09:01:38', '2019-04-22 09:01:38');

-- ----------------------------
-- Table structure for ms_tag_brand_ref
-- ----------------------------
DROP TABLE IF EXISTS `ms_tag_brand_ref`;
CREATE TABLE `ms_tag_brand_ref`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `tag_id` int(11) NOT NULL COMMENT '标签编号',
  `brand_id` int(11) NOT NULL COMMENT '品牌编号',
  `sort` smallint(6) NULL DEFAULT NULL COMMENT '排序',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '标签和品牌建立关联的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改标签和品牌关联的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '标签品牌引用表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_tag_brand_ref
-- ----------------------------
INSERT INTO `ms_tag_brand_ref` VALUES (1, 4, 3, 3, '2016-09-08 07:04:51', '2016-11-07 01:41:44');
INSERT INTO `ms_tag_brand_ref` VALUES (2, 4, 6, 5, '2016-09-08 07:05:02', '2016-11-07 01:42:09');
INSERT INTO `ms_tag_brand_ref` VALUES (3, 4, 2, 2, '2016-11-03 06:43:12', '2016-11-07 01:58:34');
INSERT INTO `ms_tag_brand_ref` VALUES (4, 4, 4, 0, '2016-11-04 09:10:49', '2016-11-04 09:10:49');
INSERT INTO `ms_tag_brand_ref` VALUES (5, 4, 5, 0, '2016-11-04 09:11:01', '2016-11-04 09:11:01');

-- ----------------------------
-- Table structure for ms_tag_goods_ref
-- ----------------------------
DROP TABLE IF EXISTS `ms_tag_goods_ref`;
CREATE TABLE `ms_tag_goods_ref`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号，采用Mysql自增主键',
  `tag_id` int(11) NOT NULL COMMENT '标签编号',
  `goods_id` int(11) NOT NULL COMMENT '商品编号',
  `sort` smallint(6) NULL DEFAULT NULL COMMENT '排序',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '标签和商品建立关联的时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '标签与商品关联关系更改的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '标签商品引用表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_tag_goods_ref
-- ----------------------------
INSERT INTO `ms_tag_goods_ref` VALUES (1, 2, 2, 1, '2016-09-08 06:50:39', '2016-11-07 01:14:19');
INSERT INTO `ms_tag_goods_ref` VALUES (2, 2, 5, 2, '2016-09-08 06:51:32', '2016-11-07 01:14:40');
INSERT INTO `ms_tag_goods_ref` VALUES (3, 3, 20, 3, '2016-11-03 02:49:31', '2016-11-07 01:19:43');
INSERT INTO `ms_tag_goods_ref` VALUES (4, 3, 21, 5, '2019-04-22 18:17:14', '2019-04-22 18:17:14');
INSERT INTO `ms_tag_goods_ref` VALUES (5, 6, 20, 5, '2019-04-22 18:17:35', '2019-04-22 18:17:36');
INSERT INTO `ms_tag_goods_ref` VALUES (6, 6, 21, 0, '2016-11-04 06:04:50', '2016-11-04 06:04:50');
INSERT INTO `ms_tag_goods_ref` VALUES (9, 18, 29, 0, '2019-04-22 14:26:50', '2016-11-04 07:05:31');
INSERT INTO `ms_tag_goods_ref` VALUES (10, 2, 2, 0, '2019-04-22 18:01:15', '2019-04-22 18:01:15');

-- ----------------------------
-- Table structure for ms_type_brand
-- ----------------------------
DROP TABLE IF EXISTS `ms_type_brand`;
CREATE TABLE `ms_type_brand`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `type_id` int(11) NOT NULL COMMENT '类型编号',
  `brand_id` int(11) NOT NULL COMMENT '品牌编号',
  `creatime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `modifytime` timestamp(0) NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '类型品牌对照表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ms_type_brand
-- ----------------------------
INSERT INTO `ms_type_brand` VALUES (2, 4, 7, '2016-09-08 01:04:04', '2016-10-18 06:51:39');
INSERT INTO `ms_type_brand` VALUES (4, 4, 5, '2016-09-08 01:22:14', '2016-09-09 02:50:31');
INSERT INTO `ms_type_brand` VALUES (5, 29, 10, '2016-10-17 07:26:59', '2016-10-17 07:26:59');
INSERT INTO `ms_type_brand` VALUES (6, 5, 5, '2016-10-18 03:29:17', '2016-10-18 03:29:17');
INSERT INTO `ms_type_brand` VALUES (7, 4, 6, '2016-10-18 06:52:10', '2016-10-18 06:52:10');
INSERT INTO `ms_type_brand` VALUES (9, 29, 11, '2016-10-18 08:56:24', '2016-10-18 08:56:24');
INSERT INTO `ms_type_brand` VALUES (10, 26, 2, '2017-01-13 02:30:02', '2017-01-13 02:30:02');
INSERT INTO `ms_type_brand` VALUES (11, 26, 3, '2017-01-13 02:30:19', '2017-01-13 02:30:19');
INSERT INTO `ms_type_brand` VALUES (12, 7, 4, '2017-01-13 02:30:44', '2017-01-13 02:30:44');
INSERT INTO `ms_type_brand` VALUES (13, 22, 10, '2017-01-13 02:31:33', '2017-01-13 02:31:33');
INSERT INTO `ms_type_brand` VALUES (14, 22, 11, '2017-01-13 02:31:47', '2017-01-13 02:31:47');
INSERT INTO `ms_type_brand` VALUES (15, 22, 13, '2017-01-13 02:31:54', '2017-01-13 02:31:54');
INSERT INTO `ms_type_brand` VALUES (16, 22, 20, '2017-01-13 02:32:08', '2017-01-13 02:32:08');
INSERT INTO `ms_type_brand` VALUES (17, 22, 21, '2017-01-13 02:32:14', '2017-01-13 02:32:14');
INSERT INTO `ms_type_brand` VALUES (18, 22, 22, '2017-01-13 02:32:19', '2017-01-13 02:32:19');
INSERT INTO `ms_type_brand` VALUES (19, 27, 22, '2017-01-13 02:34:54', '2017-01-13 02:34:54');
INSERT INTO `ms_type_brand` VALUES (21, 27, 24, '2017-01-13 02:35:20', '2017-01-13 02:35:20');
INSERT INTO `ms_type_brand` VALUES (22, 5, 41, '2017-01-13 03:46:39', '2017-01-13 03:46:39');
INSERT INTO `ms_type_brand` VALUES (23, 29, 42, '2017-01-13 04:53:24', '2017-01-13 04:53:24');
INSERT INTO `ms_type_brand` VALUES (24, 29, 43, '2017-01-13 04:53:59', '2017-01-13 04:53:59');
INSERT INTO `ms_type_brand` VALUES (25, 29, 44, '2017-01-13 04:54:33', '2017-01-13 04:54:33');
INSERT INTO `ms_type_brand` VALUES (26, 29, 45, '2017-01-13 04:55:19', '2017-01-13 04:55:19');

SET FOREIGN_KEY_CHECKS = 1;
