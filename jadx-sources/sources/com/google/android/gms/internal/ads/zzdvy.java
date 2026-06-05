package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.e0;
import fc.f;
import fc.g;
import fc.h;
import fc.i;
import fc.m;
import fc.r;
import fc.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import nc.b3;
import nc.c2;
import nc.c3;
import nc.i0;
import nc.i2;
import nc.l;
import nc.m3;
import nc.p;
import nc.s;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdvy extends c2 {
    final Map zza;
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvm zzd;
    private final zzgdm zze;
    private zzdvb zzf;

    public zzdvy(Context context, WeakReference weakReference, zzdvm zzdvmVar, zzdvz zzdvzVar, zzgdm zzgdmVar) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.zza = new HashMap();
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvmVar;
        this.zze = zzgdmVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static g zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        d8.e eVar = new d8.e(7);
        eVar.h(bundle);
        return new g(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        t responseInfo;
        i2 i2Var;
        if (obj instanceof m) {
            responseInfo = ((m) obj).f6709e;
        } else if (obj instanceof hc.b) {
            responseInfo = ((hc.b) obj).getResponseInfo();
        } else if (obj instanceof sc.a) {
            responseInfo = ((sc.a) obj).getResponseInfo();
        } else if (obj instanceof ad.c) {
            responseInfo = ((ad.c) obj).getResponseInfo();
        } else if (obj instanceof bd.a) {
            responseInfo = ((bd.a) obj).getResponseInfo();
        } else if (obj instanceof i) {
            responseInfo = ((i) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (i2Var = responseInfo.f6712a) == null) {
            return "";
        }
        try {
            return i2Var.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgdb.zzr(this.zzf.zzb(str), new zzdvw(this, str2), this.zze);
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgdb.zzr(this.zzf.zzb(str), new zzdvx(this, str2), this.zze);
        } catch (NullPointerException e10) {
            n.D.f11582h.zzw(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // nc.d2
    public final void zze(String str, xd.a aVar, xd.a aVar2) {
        Context context = (Context) xd.b.u(aVar);
        ViewGroup viewGroup = (ViewGroup) xd.b.u(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof i) {
            zzdvz.zza(context, viewGroup, (i) obj);
        } else if (obj instanceof NativeAd) {
            zzdvz.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdvb zzdvbVar) {
        this.zzf = zzdvbVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        f fVar;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    Context contextZzj = zzj();
                    e0.j(contextZzj, "context cannot be null");
                    p pVar = s.f12202f.f12204b;
                    zzbpk zzbpkVar = new zzbpk();
                    pVar.getClass();
                    i0 i0Var = (i0) new l(pVar, contextZzj, str, zzbpkVar).d(contextZzj, false);
                    try {
                        i0Var.zzk(new zzbtd(new wc.e() { // from class: com.google.android.gms.internal.ads.zzdvn
                            @Override // wc.e
                            public final void onNativeAdLoaded(NativeAd nativeAd) {
                                this.zza.zzg(str, nativeAd, str3);
                            }
                        }));
                    } catch (RemoteException e10) {
                        k.h("Failed to add google native ad listener", e10);
                    }
                    try {
                        i0Var.zzl(new m3(new zzdvv(this, str3)));
                    } catch (RemoteException e11) {
                        k.h("Failed to set AdListener.", e11);
                    }
                    try {
                        fVar = new f(contextZzj, i0Var.zze());
                    } catch (RemoteException e12) {
                        k.e("Failed to build AdLoader.", e12);
                        fVar = new f(contextZzj, new b3(new c3()));
                    }
                    fVar.a(zzk());
                    return;
                }
                return;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    sc.a.load(zzj(), str, zzk(), new zzdvs(this, str, str3));
                    return;
                }
                return;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    hc.b.load(zzj(), str, zzk(), new zzdvq(this, str, str3));
                    return;
                }
                return;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    ad.c.load(zzj(), str, zzk(), new zzdvt(this, str, str3));
                    return;
                }
                return;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    bd.a.load(zzj(), str, zzk(), new zzdvu(this, str, str3));
                    return;
                }
                return;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    i iVar = new i(zzj());
                    iVar.setAdSize(h.f6696i);
                    iVar.setAdUnitId(str);
                    iVar.setAdListener(new zzdvr(this, str, iVar, str3));
                    iVar.b(zzk());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final synchronized void zzi(String str, String str2) {
        Map map;
        Object obj;
        try {
            Activity activityZzg = this.zzd.zzg();
            if (activityZzg != null && (obj = (map = this.zza).get(str)) != null) {
                zzbct zzbctVar = zzbdc.zzjF;
                nc.t tVar = nc.t.f12227d;
                if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || (obj instanceof hc.b) || (obj instanceof sc.a) || (obj instanceof ad.c) || (obj instanceof bd.a)) {
                    map.remove(str);
                }
                zzn(zzl(obj), str2);
                if (obj instanceof hc.b) {
                    ((hc.b) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof sc.a) {
                    ((sc.a) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof ad.c) {
                    ((ad.c) obj).show(activityZzg, new r() { // from class: com.google.android.gms.internal.ads.zzdvo
                        @Override // fc.r
                        public final void onUserEarnedReward(ad.b bVar) {
                        }
                    });
                    return;
                }
                if (obj instanceof bd.a) {
                    ((bd.a) obj).show(activityZzg, new r() { // from class: com.google.android.gms.internal.ads.zzdvp
                        @Override // fc.r
                        public final void onUserEarnedReward(ad.b bVar) {
                        }
                    });
                    return;
                }
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && ((obj instanceof i) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzj = zzj();
                    intent.setClassName(contextZzj, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    r0 r0Var = n.D.f11577c;
                    r0.q(contextZzj, intent);
                }
            }
        } finally {
        }
    }
}
