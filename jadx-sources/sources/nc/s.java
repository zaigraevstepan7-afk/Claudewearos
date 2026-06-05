package nc;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbik;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbxf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: f, reason: collision with root package name */
    public static final s f12202f = new s();

    /* renamed from: a, reason: collision with root package name */
    public final rc.e f12203a;

    /* renamed from: b, reason: collision with root package name */
    public final p f12204b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12205c;

    /* renamed from: d, reason: collision with root package name */
    public final rc.a f12206d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f12207e;

    public s() throws NoSuchAlgorithmException {
        rc.e eVar = new rc.e();
        eVar.f14338a = -1.0f;
        p3 p3Var = new p3("com.google.android.gms.ads.AdManagerCreatorImpl");
        a3 a3Var = new a3("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 1);
        a3 a3Var2 = new a3("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 0);
        zzbij zzbijVar = new zzbij();
        new zzbxf();
        zzbtl zzbtlVar = new zzbtl();
        new zzbik();
        a3 a3Var3 = new a3("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 2);
        p pVar = new p();
        pVar.f12161a = p3Var;
        pVar.f12162b = a3Var;
        pVar.f12163c = a3Var2;
        pVar.f12164d = zzbijVar;
        pVar.f12165e = zzbtlVar;
        pVar.f12167z = a3Var3;
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        rc.a aVar = new rc.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        this.f12203a = eVar;
        this.f12204b = pVar;
        this.f12205c = string;
        this.f12206d = aVar;
        this.f12207e = random;
    }
}
