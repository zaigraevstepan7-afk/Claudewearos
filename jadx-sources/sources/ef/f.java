package ef;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Typeface;
import com.google.firebase.components.ComponentRegistrar;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class f implements ad.b, ag.l, k3.x, uc.c, yd.d {

    /* renamed from: a, reason: collision with root package name */
    public static f f5981a;

    public f(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public static Typeface a(String str, k3.s sVar, int i10) {
        if (i10 == 0 && fj.l.b(sVar, k3.s.f9399f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iU = hj.a.u(sVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iU) : Typeface.create(str, iU);
    }

    public static Path g(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }

    @Override // k3.x
    public Typeface c(k3.s sVar, int i10) {
        return a(null, sVar, i10);
    }

    @Override // yd.d
    public yd.c d(Context context, String str, yd.b bVar) {
        yd.c cVar = new yd.c();
        int iE = bVar.e(context, str, true);
        cVar.f20279b = iE;
        if (iE != 0) {
            cVar.f20280c = 1;
            return cVar;
        }
        int iH = bVar.h(context, str);
        cVar.f20278a = iH;
        if (iH != 0) {
            cVar.f20280c = -1;
        }
        return cVar;
    }

    public void e(String str) {
        fj.l.f(str, "msg");
        i(vk.a.f18134a, str);
    }

    @Override // k3.x
    public Typeface f(k3.u uVar, k3.s sVar, int i10) {
        String strConcat = uVar.f9403d;
        int i11 = sVar.f9401a / 100;
        if (i11 >= 0 && i11 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i11 && i11 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i11 != 4) {
            if (i11 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i11 || i11 >= 8) && 8 <= i11 && i11 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceA = a(strConcat, sVar, i10);
            if (!fj.l.b(typefaceA, Typeface.create(Typeface.DEFAULT, hj.a.u(sVar, i10))) && !fj.l.b(typefaceA, a(null, sVar, i10))) {
                typeface = typefaceA;
            }
        }
        return typeface == null ? a(uVar.f9403d, sVar, i10) : typeface;
    }

    @Override // ad.b
    public int getAmount() {
        return 1;
    }

    @Override // ad.b
    public String getType() {
        return "";
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void i(vk.a aVar, String str) {
        fj.l.f(str, "msg");
        vk.a.f18138e.compareTo(aVar);
    }

    public List j(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (kg.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f9608a;
            if (str != null) {
                bVar = new kg.b(str, bVar.f9609b, bVar.f9610c, bVar.f9611d, bVar.f9612e, new ac.l(7, str, bVar), bVar.f9614g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
