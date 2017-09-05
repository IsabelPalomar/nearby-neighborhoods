package present;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

/**
 * Neighborhood constants
 */
public class Neighborhoods {

  private Neighborhoods() {}

  /** All neighborhoods. */
  public static final Set<Neighborhood> ALL = ImmutableSet.of(
      new Neighborhood("Seacliff", new Location(37.78854055805178, -122.48691641301772)),
      new Neighborhood("Marina District", new Location(37.802984253600386, -122.43747156619716)),
      new Neighborhood("Haight-Ashbury", new Location(37.77004614015652, -122.44701394386506)),
      new Neighborhood("Richmond District", new Location(37.78064312888171, -122.47259643435996)),
      new Neighborhood("Presidio Terrace", new Location(37.78822766160633, -122.46091960504893)),
      new Neighborhood("Saint Francis Wood", new Location(37.73465338636828, -122.46802720748299)),
      new Neighborhood("Crocker-Amazon", new Location(37.70937767352953, -122.43858686223344)),
      new Neighborhood("Ingleside", new Location(37.722987118255276, -122.45302720502076)),
      new Neighborhood("Brisbane", new Location(37.680766047046745, -122.39997151813208)),
      new Neighborhood("Western Addition", new Location(37.77955892970621, -122.42981042287754)),
      new Neighborhood("Colma", new Location(37.676877849802594, -122.4596950089953)),
      new Neighborhood("Bayview District", new Location(37.73409733091176, -122.39135961553549)),
      new Neighborhood("Pacific Heights", new Location(37.79271709276509, -122.43564456276242)),
      new Neighborhood("Japantown", new Location(37.785578896384465, -122.42980891413497)),
      new Neighborhood("Broadmoor", new Location(37.689933166909555, -122.48108411715152)),
      new Neighborhood("Potrero Hill", new Location(37.75965199348815, -122.39802624604356)),
      new Neighborhood("Mission District", new Location(37.75992993739737, -122.41913766174767)),
      new Neighborhood("Daly City", new Location(37.705767084918506, -122.46192057192594)),
      new Neighborhood("North Beach", new Location(37.80117485216232, -122.40900218061122)),
      new Neighborhood("Bayshore", new Location(37.70632079344216, -122.41330477914826)),
      new Neighborhood("Westlake", new Location(37.69771065104521, -122.48052831315208)),
      new Neighborhood("Sunset District", new Location(37.75354175371271, -122.49524953351477)),
      new Neighborhood("Eastmont", new Location(37.76909496178439, -122.17218860552606)),
      new Neighborhood("Forest Hill", new Location(37.74743067574695, -122.46358253568717)),
      new Neighborhood("Jordan Park", new Location(37.78465152261733, -122.456638380365)),
      new Neighborhood("Mulford Gardens", new Location(37.70465254325352, -122.17968856484765)),
      new Neighborhood("Hayward Park", new Location(37.554380525873285, -122.31330272313699)),
      new Neighborhood("Henderson", new Location(37.479382357580846, -122.16552004718025)),
      new Neighborhood("Kentfield", new Location(37.95199571656235, -122.55721166307755)),
      new Neighborhood("Ashland", new Location(37.69465276512946, -122.11385315782836)),
      new Neighborhood("Halvern", new Location(37.625211044269776, -122.05246233878589)),
      new Neighborhood("Seal Cove", new Location(37.51910713038623, -122.51275647939715)),
      new Neighborhood("Mill Valley", new Location(37.90603673563359, -122.54497634755808)),
      new Neighborhood("Canyon", new Location(37.83030448026122, -122.1658667226955)),
      new Neighborhood("East Richmond Heights", new Location(37.94492398867391, -122.3135811699604)),
      new Neighborhood("Redwood Junction", new Location(37.47733683793038, -122.22176454531227)),
      new Neighborhood("Vallemar", new Location(37.61354737454673, -122.48080810108004)),
      new Neighborhood("Baden", new Location(37.64965644578018, -122.43413942440957)),
      new Neighborhood("Atherton", new Location(37.461327151411865, -122.19774301664535)),
      new Neighborhood("Point Richmond", new Location(37.92409143888838, -122.38913832737548)),
      new Neighborhood("Palomar Park", new Location(37.48214469759071, -122.26561204101256)),
      new Neighborhood("Valle Vista", new Location(37.82270444101573, -122.1388541118811)),
      new Neighborhood("Half Moon Bay", new Location(37.46355187615219, -122.42858624591906)),
      new Neighborhood("Waldo", new Location(37.87103784747549, -122.50358458184954)),
      new Neighborhood("Princeton-by-the-Sea", new Location(37.50494087583269, -122.48692228034994)),
      new Neighborhood("South San Francisco", new Location(37.65494928235813, -122.40812518208217)),
      new Neighborhood("Meadowsweet", new Location(37.922980669079834, -122.50941897319154)),
      new Neighborhood("Thousand Oaks", new Location(37.89532256790204, -122.28141033593303)),
      new Neighborhood("Reed", new Location(37.90492563054892, -122.50052921050475)),
      new Neighborhood("Edgemar", new Location(37.65382367658094, -122.49080746010893)),
      new Neighborhood("Carpenter", new Location(37.61326708370461, -122.04440657546486)),
      new Neighborhood("Elmhurst", new Location(37.75187316824795, -122.17191082925487)),
      new Neighborhood("Mowry Landing", new Location(37.51898047982928, -122.01214714472094)),
      new Neighborhood("Alamo", new Location(37.85020328603321, -122.0321840004382)),
      new Neighborhood("Skylark", new Location(37.94325775014203, -122.54497668283422)),
      new Neighborhood("North Fair Oaks", new Location(37.47438221706173, -122.19663191156064)),
      new Neighborhood("West End", new Location(37.7724286961336, -122.28108067568122)),
      new Neighborhood("San Lorenzo", new Location(37.68104214693727, -122.12440882377092)),
      new Neighborhood("Hillsdale", new Location(37.5363255711614, -122.30552456844904)),
      new Neighborhood("Mulford", new Location(37.70937457222536, -122.17968864866668)),
      new Neighborhood("Alameda", new Location(37.76520751891155, -122.2416355231657)),
      new Neighborhood("Tamalpais Valley Junction", new Location(37.88192937627818, -122.52507460812)),
      new Neighborhood("Burlingame", new Location(37.58410258688849, -122.36608256159221)),
      new Neighborhood("Redwood City", new Location(37.486323830694005, -122.23252330476866)),
      new Neighborhood("Meinert", new Location(37.944089654032005, -122.0274620552854)),
      new Neighborhood("Shelter Cove", new Location(37.59632608392451, -122.51275430010234)),
      new Neighborhood("Woodstock", new Location(37.77631756392998, -122.28580287229113)),
      new Neighborhood("Kensington", new Location(37.91048048542007, -122.28024717922966)),
      new Neighborhood("Melrose", new Location(37.769928374416935, -122.20524532289981)),
      new Neighborhood("West Berkeley", new Location(37.868950753585295, -122.29682666752588)),
      new Neighborhood("San Mateo Park", new Location(37.56660293326186, -122.3452484192451)),
      new Neighborhood("Emerald Lake", new Location(37.46660464910701, -122.26302245202712)),
      new Neighborhood("South Berkeley", new Location(37.85515749372294, -122.27237523104522)),
      new Neighborhood("Moss Beach", new Location(37.52744016706426, -122.51331186430143)),
      new Neighborhood("Pacific Manor", new Location(37.65021266887476, -122.48969643884327)),
      new Neighborhood("Westborough", new Location(37.643545870728616, -122.45886243455307)),
      new Neighborhood("Piedmont", new Location(37.824371433918884, -122.23163507448938)),
      new Neighborhood("Fairview", new Location(37.67854216049673, -122.04579537300168)),
      new Neighborhood("El Granada", new Location(37.50285319520927, -122.46951591730563)),
      new Neighborhood("Sausalito", new Location(37.859027166961084, -122.48546944507288)),
      new Neighborhood("San Quentin", new Location(37.94131323242482, -122.48497390695725)),
      new Neighborhood("Tanforan", new Location(37.63893037574613, -122.41159755310987)),
      new Neighborhood("Moraga", new Location(37.83471059530245, -122.1295596709091)),
      new Neighborhood("Devonshire", new Location(37.50132634772717, -122.2838567620123)),
      new Neighborhood("Union City", new Location(37.5963231502584, -122.0816297692681)),
      new Neighborhood("Jarvis Landing", new Location(37.52938133202022, -122.06357372490884)),
      new Neighborhood("Cooley Landing", new Location(37.47660493014527, -122.12163030668792)),
      new Neighborhood("University Village", new Location(37.88492565520562, -122.30108081866258)),
      new Neighborhood("Hillsborough", new Location(37.57410314404055, -122.37941632552257)),
      new Neighborhood("Russell City", new Location(37.65270997310628, -122.13357577599567)),
      new Neighborhood("Marin City", new Location(37.86853794485398, -122.50914044254907)),
      new Neighborhood("Belle Haven", new Location(37.47630368454523, -122.159317857927)),
      new Neighborhood("Redwood Shores", new Location(37.531880396451385, -122.2480219466507)),
      new Neighborhood("Rheem Valley", new Location(37.85992553934321, -122.12385377414276)),
      new Neighborhood("Millbrae", new Location(37.59854678535129, -122.3871942287534)),
      new Neighborhood("Muir Beach", new Location(37.86214925825513, -122.58136671546202)),
      new Neighborhood("West Oakland", new Location(37.811604035185944, -122.29056287128431)),
      new Neighborhood("Montara", new Location(37.54216155506501, -122.51608920791799)),
      new Neighborhood("Murray Park", new Location(37.94436885522671, -122.5535883339737)),
      new Neighborhood("Harbor Point", new Location(37.88187078677501, -122.50080673531879)),
      new Neighborhood("Cherryland", new Location(37.67937557312928, -122.10329715660971)),
      new Neighborhood("Kent Woodlands", new Location(37.949369750117114, -122.56331410768303)),
      new Neighborhood("Bel Aire", new Location(37.901314622842726, -122.49914041296792)),
      new Neighborhood("Tiburon", new Location(37.873437083439875, -122.45661222882711)),
      new Neighborhood("South Shore", new Location(37.75965107147879, -122.25774704980776)),
      new Neighborhood("Corte Madera", new Location(37.925480571701314, -122.527475520465)),
      new Neighborhood("Almonte", new Location(37.88992613100089, -122.52497494729124)),
      new Neighborhood("Manzanita", new Location(37.88159317814191, -122.51747440123643)),
      new Neighborhood("Lomita Park", new Location(37.616601823882206, -122.40441686048015)),
      new Neighborhood("Fernside", new Location(37.76520642926414, -122.22885731177767)),
      new Neighborhood("Pleasant Hill", new Location(37.94797852182839, -122.06079638129228)),
      new Neighborhood("Contra Costa Centre", new Location(37.927660872354835, -122.05584703510638)),
      new Neighborhood("Stinson Beach", new Location(37.90080835589106, -122.64508015987387)),
      new Neighborhood("Highlands", new Location(37.51993786080976, -122.34385962170828)),
      new Neighborhood("Belvedere Island", new Location(37.876899982916996, -122.47130000539612)),
      new Neighborhood("Chinatown", new Location(37.79993005572203, -122.27023860010726)),
      new Neighborhood("San Bruno", new Location(37.63049038598362, -122.41108357480726)),
      new Neighborhood("El Campo", new Location(37.897425755046356, -122.46525070205676)),
      new Neighborhood("San Leandro", new Location(37.7249295404967, -122.15607682742689)),
      new Neighborhood("Hilarita", new Location(37.88409299694436, -122.47191733256486)),
      new Neighborhood("Pedro Valley", new Location(37.59334355131827, -122.49785513193528)),
      new Neighborhood("Hayward", new Location(37.66882049391998, -122.08079644045462)),
      new Neighborhood("Albany", new Location(37.886869921465745, -122.29774750340854)),
      new Neighborhood("Strawberry", new Location(37.896870286323036, -122.50886300155403)),
      new Neighborhood("Seminary Park", new Location(37.77353938212312, -122.18774474726385)),
      new Neighborhood("Larkspur", new Location(37.934091468469546, -122.53525392661004)),
      new Neighborhood("Fort McDowell", new Location(37.862704559340386, -122.42274967528223)),
      new Neighborhood("Paradise Cay", new Location(37.91270303086557, -122.47552884318523)),
      new Neighborhood("Saranap", new Location(37.889105375042135, -122.07650390020137)),
      new Neighborhood("Belmont", new Location(37.52021446361451, -122.27580083105319)),
      new Neighborhood("Glorietta", new Location(37.862147917150615, -122.1680217100014)),
      new Neighborhood("Baumberg", new Location(37.62076662393105, -122.10024144998879)),
      new Neighborhood("Ravenswood", new Location(37.47632715387411, -122.13524176307043)),
      new Neighborhood("Farm Hills", new Location(37.45660478716391, -122.2555221574294)),
      new Neighborhood("Tamalpais Valley", new Location(37.879648660424664, -122.54580934109545)),
      new Neighborhood("Strawberry Manor", new Location(37.89464815997272, -122.5116409319038)),
      new Neighborhood("Walnut Creek", new Location(37.90631308698124, -122.06496302535984)),
      new Neighborhood("Castro Valley", new Location(37.69408606465589, -122.08636051541923)),
      new Neighborhood("Cragmont", new Location(37.89520304196279, -122.26496906522013)),
      new Neighborhood("Lafayette", new Location(37.88575814582882, -122.11802013717207)),
      new Neighborhood("Brookshire", new Location(37.75909468074613, -122.02829471354666)),
      new Neighborhood("Newark", new Location(37.52965927592945, -122.04023993139731)),
      new Neighborhood("Chapman", new Location(37.918677483809574, -122.52393902787803)),
      new Neighborhood("East Richmond", new Location(37.94188546495445, -122.32076798137943)),
      new Neighborhood("Bolinas", new Location(37.90937013470668, -122.6863733544011)),
      new Neighborhood("Fairway Park", new Location(37.620769389959094, -122.48830822803967)),
      new Neighborhood("Atchison Village", new Location(37.93374605023976, -122.37131798213343)),
      new Neighborhood("East Palo Alto", new Location(37.46882727837155, -122.14107514858402)),
      new Neighborhood("Sharp Park", new Location(37.63604658195928, -122.48803003267334)),
      new Neighborhood("Lindenwood", new Location(37.468827026914454, -122.18163165764132)),
      new Neighborhood("Hookston", new Location(37.941312058958374, -122.0527405341522)),
      new Neighborhood("Miramar", new Location(37.49299624471527, -122.45664315804983)),
      new Neighborhood("Orinda Village", new Location(37.88550643727652, -122.19219444820158)),
      new Neighborhood("Millbrae Meadows", new Location(37.6021581283336, -122.41719523950624)),
      new Neighborhood("El Cerrito", new Location(37.915405524086765, -122.30141106564761)),
      new Neighborhood("Belvedere", new Location(37.872704337464455, -122.46441712178616)),
      new Neighborhood("Woodville", new Location(37.944647050593034, -122.70637483848697)),
      new Neighborhood("Mattos", new Location(37.5431147450939, -122.01662945126202)),
      new Neighborhood("Walnut Heights", new Location(37.877571121904076, -122.0522819602296)),
      new Neighborhood("Highland Park", new Location(37.797705582438795, -122.22746826278374)),
      new Neighborhood("Alto", new Location(37.904370078006565, -122.52553066747166)),
      new Neighborhood("Little Reed Heights", new Location(37.89575918123836, -122.48580664903754)),
      new Neighborhood("Hillsborough Park", new Location(37.55493683278692, -122.3588601270847)),
      new Neighborhood("Rockaway Beach", new Location(37.6085477369418, -122.49525322155216)),
      new Neighborhood("Bancroft", new Location(37.933812183455814, -122.04718475727172)),
      new Neighborhood("San Carlos", new Location(37.504935930509816, -122.26182367223522)),
      new Neighborhood("Sorenson", new Location(37.64542425522981, -122.06642910404392)),
      new Neighborhood("Belle Monte", new Location(37.519103777624956, -122.29691291730956)),
      new Neighborhood("Emeryville", new Location(37.831408879823385, -122.28652664963015)),
      new Neighborhood("Baltimore Park", new Location(37.93075815321549, -122.53247591244124)),
      new Neighborhood("Linda Mar", new Location(37.59549283893003, -122.49414245174363)),
      new Neighborhood("Emerald Lake Hills", new Location(37.464660299027855, -122.26802276018428)),
      new Neighborhood("Brookfield Village", new Location(37.735207178710965, -122.18607792199874)),
      new Neighborhood("Pacifica", new Location(37.61382523463694, -122.48691943050288)),
      new Neighborhood("Lockwood Gardens", new Location(37.76159525391989, -122.19663392321742)),
      new Neighborhood("Oakland", new Location(37.80445569670249, -122.27135632689544)),
      new Neighborhood("Menlo Oaks", new Location(37.46743822937762, -122.16746464871649)),
      new Neighborhood("Easter Hill Village", new Location(37.92353571870796, -122.34441517425063)),
      new Neighborhood("Orinda", new Location(37.87714758433674, -122.17968881630475)),
      new Neighborhood("Richmond", new Location(37.93575753936335, -122.34774865714272)),
      new Neighborhood("Menlo Park", new Location(37.453827359728336, -122.18218712636465)),
      new Neighborhood("Greenbrae", new Location(37.948535583113305, -122.52470312217132)),
      new Neighborhood("Laurel", new Location(37.5318812346417, -122.30774694625649)),
      new Neighborhood("Jingletown", new Location(37.777401763105466, -122.23443597125384)),
      new Neighborhood("Idora Park", new Location(37.842455892929934, -122.26315698157305)),
      new Neighborhood("San Francisco", new Location(37.76479923640795, -122.46298976749473)),
      new Neighborhood("McCovey Cove", new Location(37.77762296153023, -122.38847305572061)),
      new Neighborhood("Jack London Square", new Location(37.79578855736398, -122.27468511592177)),
      new Neighborhood("Northeast Waterfront Historic District", new Location(37.80020632325062, -122.40108212030256)),
      new Neighborhood("Albany Hill", new Location(37.89492534951065, -122.30469207782586)),
      new Neighborhood("Liberty Street Historic District", new Location(37.757430034775865, -122.42330430581524)),
      new Neighborhood("Russian Hill-Macondray Lane Historic District", new Location(37.79909538580401, -122.41497126913721)),
      new Neighborhood("Russian Hill-Paris Block Architectural District", new Location(37.798539749442625, -122.41636015049306)),
      new Neighborhood("Old Oakland Historic District", new Location(37.80131675778304, -122.27469156998723)),
      new Neighborhood("Pill Hill", new Location(37.82020504130844, -122.26413590404466)),
      new Neighborhood("Noe Valley", new Location(37.75159053047295, -122.43208141572337)),
      new Neighborhood("Burlingame Village", new Location(37.59270292245873, -122.378207738904)),
      new Neighborhood("Wilder", new Location(37.86235805146319, -122.18763460905613)),
      new Neighborhood("Baltimore Canyon", new Location(37.93164286309547, -122.54162014970838)),
      new Neighborhood("Greenbrae Marina", new Location(37.94010464580623, -122.5230377218298)),
      new Neighborhood("Heather Gardens", new Location(37.93438458362351, -122.52964676866308)),
      new Neighborhood("Rockridge", new Location(37.843645620266386, -122.24783720950474)),
      new Neighborhood("Temescal", new Location(37.837206223153345, -122.25873770694383)),
      new Neighborhood("Montclair", new Location(37.82676823913135, -122.20967256033705)),
      new Neighborhood("Dimond District", new Location(37.799782618045185, -122.21457672806483)),
      new Neighborhood("Lakeside", new Location(37.80383342421089, -122.26308070625417)),
      new Neighborhood("Piedmont Avenue", new Location(37.82769703782202, -122.25100431161887)),
      new Neighborhood("Uptown", new Location(37.80927562630338, -122.26994674223873)),
      new Neighborhood("Northgate / Koreatown", new Location(37.81630175663858, -122.26790826338694)),
      new Neighborhood("Adams Point", new Location(37.81040299228022, -122.25590261201445)),
      new Neighborhood("Downtown", new Location(37.80362949250667, -122.27152446787309)),
      new Neighborhood("Financial District", new Location(37.80992363123772, -122.26494065056838)),
      new Neighborhood("Westlake", new Location(37.816810035247045, -122.2592824468311)),
      new Neighborhood("Dogpatch", new Location(37.760697635909025, -122.38920161074442)),
      new Neighborhood("Inner Sunset", new Location(37.7614499955379, -122.4676432324986)),
      new Neighborhood("South of Market", new Location(37.78089249050112, -122.40095186552726)),
      new Neighborhood("South Beach", new Location(37.779813823381716, -122.3911499003181)),
      new Neighborhood("Nob Hill", new Location(37.79447913645021, -122.41559211670528)),
      new Neighborhood("Telegraph Hill", new Location(37.80078492602669, -122.40409080444671)),
      new Neighborhood("Financial District", new Location(37.79364664582704, -122.39893786183272)),
      new Neighborhood("Presidio Heights", new Location(37.78875102764047, -122.45302661828754)),
      new Neighborhood("Lower Pacific Heights", new Location(37.785766567196504, -122.43890420108757)),
      new Neighborhood("North of Panhandle", new Location(37.778408094400476, -122.4425992792826)),
      new Neighborhood("Russian Hill", new Location(37.8000728833521, -122.41709423757298)),
      new Neighborhood("Cow Hollow", new Location(37.797261593027685, -122.43624772451479)),
      new Neighborhood("San Mateo", new Location(37.54396835811309, -122.30667892415411)),
      new Neighborhood("Foster City", new Location(37.5600335328306, -122.26885223332235)),
      new Neighborhood("North Berkeley", new Location(37.877950570660744, -122.27368196974994)),
      new Neighborhood("Northside", new Location(37.876051650496805, -122.26031132544563)),
      new Neighborhood("Elmwood", new Location(37.85778454981559, -122.25386874320937)),
      new Neighborhood("Northbrae", new Location(37.88818428770239, -122.27560511361409)),
      new Neighborhood("Panoramic Hill", new Location(37.8691557749369, -122.24575246254746)),
      new Neighborhood("Westbrae", new Location(37.8813401284851, -122.28985610920873)),
      new Neighborhood("Claremont", new Location(37.856090399546154, -122.24519967603312)),
      new Neighborhood("Laurel", new Location(37.7912172350112, -122.1971811776756)),
      new Neighborhood("West Portal", new Location(37.74034335751861, -122.46636650100723)),
      new Neighborhood("Cole Valley", new Location(37.7658132790539, -122.44996244594442)),
      new Neighborhood("Fruitvale", new Location(37.777307885789924, -122.22522560077064)),
      new Neighborhood("Mission Bay", new Location(37.770774192266174, -122.39117127417116)),
      new Neighborhood("Arcadia Park", new Location(37.74195142564244, -122.18005116597892)),
      new Neighborhood("San Francisco Bay Area", new Location(37.788496888336255, -122.35584733580801)),
      new Neighborhood("Southside", new Location(37.86695359751613, -122.25841517130974)),
      new Neighborhood("Grand Lake", new Location(37.81161468020298, -122.24635352882402)),
      new Neighborhood("West SoMa", new Location(37.77680857581788, -122.40843656978508)),
      new Neighborhood("Marina Bay", new Location(37.91389141709749, -122.3456721244505)),
      new Neighborhood("Richmond Annex", new Location(37.9095790955528, -122.31342535038041)),
      new Neighborhood("Oakmore Highlands", new Location(37.808240796537575, -122.2148381596248)),
      new Neighborhood("San Antonio", new Location(37.79077894529428, -122.2437556417544)),
      new Neighborhood("Downtown Berkeley", new Location(37.869857172594465, -122.26790843102502)),
      new Neighborhood("Harrison/Oakland", new Location(37.81711538797964, -122.25707792247744)),
      new Neighborhood("Winehaven", new Location(37.95240106539984, -122.41629577747669)),
      new Neighborhood("San Mateo", new Location(37.496903971793785, -122.33305736017438)),
      new Neighborhood("Gourmet Ghetto", new Location(37.87982987717129, -122.26925976145466)),
      new Neighborhood("Lower Bottoms", new Location(37.81042185156238, -122.29931424874974)),
      new Neighborhood("Berkeley Hills", new Location(37.88965715572803, -122.2586309214974)),
      new Neighborhood("Central Berkeley", new Location(37.870494867787926, -122.28195775802931)),
      new Neighborhood("Berkeley Marina", new Location(37.86786638677174, -122.31305285860338)),
      new Neighborhood("Ocean View", new Location(37.873621988223896, -122.30192177500798)),
      new Neighborhood("Poets Corner", new Location(37.865315857455066, -122.28610336351987)),
      new Neighborhood("LeConte", new Location(37.86106564581286, -122.26327256801781)),
      new Neighborhood("Lorin", new Location(37.84880702860257, -122.27159085254623)),
      new Neighborhood("Harmon Tract", new Location(37.84885639801225, -122.27801256384359)),
      new Neighborhood("Point Emery", new Location(37.84569533086844, -122.30205965731518)),
      new Neighborhood("Mosswood", new Location(37.82464057682978, -122.2638655038483)),
      new Neighborhood("South Prescott", new Location(37.80441948688079, -122.29813047256454)),
      new Neighborhood("Broadway Auto Row", new Location(37.82443714803978, -122.25863528008708)),
      new Neighborhood("Hoover-Foster", new Location(37.8213205888018, -122.27294452990874)),
      new Neighborhood("Longfellow", new Location(37.83309984496961, -122.27189310397468)),
      new Neighborhood("Castro District", new Location(37.760856053879024, -122.43495707906413)),
      new Neighborhood("Chinatown", new Location(37.79430102100778, -122.4063757112518)),
      new Neighborhood("Oak Glen Park", new Location(37.82018836132113, -122.25949576626685)),
      new Neighborhood("Devil's Slide", new Location(37.58027918175591, -122.51690736548676)),
      new Neighborhood("Civic Center", new Location(37.80058434708374, -122.26473453956933)),
      new Neighborhood("San Pablo Gateway", new Location(37.808923921646226, -122.27387542407521)),
      new Neighborhood("Trestle Glen", new Location(37.8083754937216, -122.23815812299611)),
      new Neighborhood("Lakeshore", new Location(37.811450730176915, -122.24271687249411)),
      new Neighborhood("Cleveland Heights", new Location(37.80454571834258, -122.24532490166655)),
      new Neighborhood("Iron Triangle", new Location(37.940112273338116, -122.3643356053328)),
      new Neighborhood("Portola", new Location(37.72637893919347, -122.40855140185856)),
      new Neighborhood("Ocean View", new Location(37.713651186862535, -122.4574830247478)),
      new Neighborhood("Anza Vista", new Location(37.78083633174984, -122.44314896449269)),
      new Neighborhood("Union Square", new Location(37.78751377491304, -122.40715900010338)),
      new Neighborhood("Bay Farm Island", new Location(37.738563628017765, -122.24399251433809)),
      new Neighborhood("Upper Rockridge", new Location(37.8450457333725, -122.23774573335994)),
      new Neighborhood("Bernal Heights", new Location(37.7410007501845, -122.41421362890935)),
      new Neighborhood("San Pablo Park", new Location(37.85665181942073, -122.28415867816459)),
      new Neighborhood("Tenderloin", new Location(37.78424927508405, -122.41399335249396)),
      new Neighborhood("Civic Center", new Location(37.77959388224244, -122.41679383016327)),
      new Neighborhood("Visitacion Valley", new Location(37.71213188309332, -122.40971288218131)),
      new Neighborhood("Duboce Triangle", new Location(37.76713812266951, -122.43223002686666)),
      new Neighborhood("Golden Gate", new Location(37.84177754550612, -122.28275311682144)),
      new Neighborhood("East End", new Location(37.756955786694306, -122.23415425548816)),
      new Neighborhood("Excelsior", new Location(37.72179428961465, -122.43538153864084)),
      new Neighborhood("Glen Park", new Location(37.73428097841028, -122.43446967139458)),
      new Neighborhood("Hayes Valley", new Location(37.7766852780222, -122.42293617262786)),
      new Neighborhood("Glenview", new Location(37.8072395782035, -122.2214432669636)),
      new Neighborhood("Gold Coast", new Location(37.766650463542874, -122.26423782798727)),
      new Neighborhood("Hunters Point", new Location(37.726771463719075, -122.37157186998056)),
      new Neighborhood("Millsmont", new Location(37.77537719821294, -122.17926553019447)),
      new Neighborhood("Contempo", new Location(37.58526079826901, -122.06768261766352)),
      new Neighborhood("Downtown Pleasant Hill", new Location(37.9460718903135, -122.06148562519024))
  );
}
