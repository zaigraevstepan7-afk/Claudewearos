package xc;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvo;
import com.google.android.gms.internal.ads.zzdyq;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgdb;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements zzgci {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19931b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f19930a = i10;
        this.f19931b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final mf.a zza(Object obj) {
        switch (this.f19930a) {
            case 0:
                final l lVar = (l) this.f19931b;
                final Uri uri = (Uri) obj;
                return zzgdb.zzm(lVar.u("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfut(lVar, uri) { // from class: xc.h

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Uri f19937a;

                    {
                        this.f19937a = uri;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        Uri uri2 = this.f19937a;
                        return !zIsEmpty ? l.B(uri2, "nas", str) : uri2;
                    }
                }, lVar.f19966f);
            case 1:
                final l lVar2 = (l) this.f19931b;
                final ArrayList arrayList = (ArrayList) obj;
                return zzgdb.zzm(lVar2.u("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfut() { // from class: xc.d
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        ArrayList arrayList2 = new ArrayList();
                        for (Uri uri2 : arrayList) {
                            l lVar3 = lVar2;
                            if (!l.z(uri2, lVar3.R, lVar3.S) || TextUtils.isEmpty(str)) {
                                arrayList2.add(uri2);
                            } else {
                                arrayList2.add(l.B(uri2, "nas", str));
                            }
                        }
                        return arrayList2;
                    }
                }, lVar2.f19966f);
            default:
                zzdyq zzdyqVar = (zzdyq) obj;
                v vVar = new v(new JsonReader(new InputStreamReader(zzdyqVar.zzb())), zzdyqVar.zza());
                zzbvo zzbvoVar = (zzbvo) this.f19931b;
                try {
                    vVar.f20025b = nc.s.f12202f.f12203a.j(zzbvoVar.zza).toString();
                } catch (JSONException unused) {
                    vVar.f20025b = "{}";
                }
                Bundle bundle = zzbvoVar.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        vVar.f20026c = nc.s.f12202f.f12203a.j(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgdb.zzh(vVar);
        }
    }
}
