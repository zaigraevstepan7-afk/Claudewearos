package lh;

import ag.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzdsc;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import kk.i;
import kk.t;
import l.h;
import l.m;
import mc.n;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements l, m, rc.d, ti.g, yd.d {
    public /* synthetic */ e(rc.e eVar) {
    }

    public static final float e(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i11 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i11];
            float f19 = fArr[i10];
            f11 = fArr2[i11];
            f12 = f18;
            f13 = fArr2[i10];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static t f(String str) {
        fj.l.f(str, "<this>");
        i iVar = lk.c.f11002a;
        kk.f fVar = new kk.f();
        fVar.h0(str);
        return lk.c.d(fVar, false);
    }

    public static final boolean g(Context context, Intent intent, pc.c cVar, pc.a aVar, boolean z2, zzdsc zzdscVar, String str) {
        int iD;
        if (z2) {
            Uri data = intent.getData();
            try {
                n.D.f11577c.getClass();
                iD = r0.D(context, data);
                if (cVar != null) {
                    cVar.zzg();
                }
            } catch (ActivityNotFoundException e10) {
                String message = e10.getMessage();
                int i10 = l0.f13401b;
                k.g(message);
                iD = 6;
            }
            if (aVar != null) {
                aVar.zzb(iD);
            }
            return iD == 5;
        }
        try {
            l0.k("Launching an intent: " + intent.toURI());
            if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zznm)).booleanValue()) {
                r0 r0Var = n.D.f11577c;
                r0.s(context, intent, zzdscVar, str);
            } else {
                r0 r0Var2 = n.D.f11577c;
                r0.q(context, intent);
            }
            if (cVar != null) {
                cVar.zzg();
            }
            if (aVar != null) {
                aVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            String message2 = e11.getMessage();
            int i11 = l0.f13401b;
            k.g(message2);
            if (aVar != null) {
                aVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean h(Context context, pc.e eVar, pc.c cVar, pc.a aVar, zzdsc zzdscVar, String str) throws NumberFormatException {
        int i10 = 0;
        if (eVar == null) {
            int i11 = l0.f13401b;
            k.g("No intent data for launcher overlay.");
            return false;
        }
        zzbdc.zza(context);
        Intent intent = eVar.A;
        if (intent != null) {
            return g(context, intent, cVar, aVar, eVar.C, zzdscVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f12831b;
        if (TextUtils.isEmpty(str2)) {
            int i12 = l0.f13401b;
            k.g("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f12832c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f12833d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f12834e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i13 = l0.f13401b;
                k.g("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = eVar.f12835f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i10 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i14 = l0.f13401b;
                k.g("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        zzbct zzbctVar = zzbdc.zzeL;
        nc.t tVar = nc.t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzeK)).booleanValue()) {
                r0 r0Var = n.D.f11577c;
                r0.F(context, intent2);
            }
        }
        return g(context, intent2, cVar, aVar, eVar.C, zzdscVar, str);
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // l.m
    public boolean c(h hVar) {
        return false;
    }

    @Override // yd.d
    public yd.c d(Context context, String str, yd.b bVar) {
        int iE;
        yd.c cVar = new yd.c();
        int iH = bVar.h(context, str);
        cVar.f20278a = iH;
        int i10 = 1;
        int i11 = 0;
        if (iH != 0) {
            iE = bVar.e(context, str, false);
            cVar.f20279b = iE;
        } else {
            iE = bVar.e(context, str, true);
            cVar.f20279b = iE;
        }
        int i12 = cVar.f20278a;
        if (i12 == 0) {
            if (iE == 0) {
                i10 = 0;
            }
            cVar.f20280c = i10;
            return cVar;
        }
        i11 = i12;
        if (i11 >= iE) {
            i10 = -1;
        }
        cVar.f20280c = i10;
        return cVar;
    }

    @Override // rc.d
    public rc.n zza(String str) {
        new kc.c(1, str).start();
        return rc.n.f14353a;
    }

    @Override // l.m
    public void a(h hVar, boolean z2) {
    }
}
