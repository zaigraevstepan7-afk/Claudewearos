package y9;

import ag.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import c2.j0;
import c2.w;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdsc;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Mac;
import k3.s;
import k3.u;
import k3.x;
import mc.n;
import nc.t;
import pc.e;
import pi.h;
import qc.r0;
import r6.c;
import uc.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements l, dc.a, x, c, b, yd.b {
    public static Typeface i(String str, s sVar, int i10) {
        if (i10 == 0 && fj.l.b(sVar, s.f9399f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), sVar.f9401a, i10 == 1);
    }

    public static j0 j(h[] hVarArr) {
        return k((h[]) Arrays.copyOf(hVarArr, hVarArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static j0 k(h[] hVarArr, long j, long j4) {
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (h hVar : hVarArr) {
            arrayList.add(new w(((w) hVar.f13001b).f3060a));
        }
        ArrayList arrayList2 = new ArrayList(hVarArr.length);
        for (h hVar2 : hVarArr) {
            arrayList2.add(Float.valueOf(((Number) hVar2.f13000a).floatValue()));
        }
        return new j0(arrayList, arrayList2, j, j4);
    }

    public static j0 l(List list, float f10, int i10) {
        return new j0(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i10 & 4) != 0 ? Float.POSITIVE_INFINITY : f10) & 4294967295L));
    }

    public static final void m(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z2, zzdsc zzdscVar) throws NumberFormatException {
        if (adOverlayInfoParcel.D == 4 && adOverlayInfoParcel.f3443c == null) {
            nc.a aVar = adOverlayInfoParcel.f3442b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            zzddw zzddwVar = adOverlayInfoParcel.N;
            if (zzddwVar != null) {
                zzddwVar.zzdf();
            }
            Activity activityZzi = adOverlayInfoParcel.f3444d.zzi();
            e eVar = adOverlayInfoParcel.f3441a;
            Context context2 = (eVar == null || !eVar.C || activityZzi == null) ? context : activityZzi;
            lh.e eVar2 = n.D.f11575a;
            lh.e.h(context2, eVar, adOverlayInfoParcel.B, eVar != null ? eVar.B : null, zzdscVar, adOverlayInfoParcel.J);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.F.f14324d);
        intent.putExtra("shouldCallOnOverlayOpened", z2);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznm)).booleanValue()) {
            r0 r0Var = n.D.f11577c;
            r0.s(context, intent, zzdscVar, adOverlayInfoParcel.J);
        } else {
            r0 r0Var2 = n.D.f11577c;
            r0.q(context, intent);
        }
    }

    @Override // dc.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // k3.x
    public Typeface c(s sVar, int i10) {
        return i(null, sVar, i10);
    }

    @Override // r6.c
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // yd.b
    public int e(Context context, String str, boolean z2) {
        return yd.e.d(context, str, z2);
    }

    @Override // k3.x
    public Typeface f(u uVar, s sVar, int i10) {
        return i(uVar.f9403d, sVar, i10);
    }

    @Override // r6.c
    public void g(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // yd.b
    public int h(Context context, String str) {
        return yd.e.a(context, str);
    }
}
