package qc;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13342b;

    public /* synthetic */ c(k kVar, int i10) {
        this.f13341a = i10;
        this.f13342b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13341a) {
            case 0:
                k kVar = this.f13342b;
                kVar.c(kVar.f13383a);
                return;
            case 1:
                k kVar2 = this.f13342b;
                kVar2.f13389g = 4;
                kVar2.b();
                return;
            case 2:
                k kVar3 = this.f13342b;
                mc.n nVar = mc.n.D;
                n nVar2 = nVar.f11588o;
                Context context = kVar3.f13383a;
                String str = kVar3.f13386d;
                String str2 = kVar3.f13387e;
                nVar2.getClass();
                zzbct zzbctVar = zzbdc.zzfd;
                nc.t tVar = nc.t.f12227d;
                String strJ = n.j(context, nVar2.k(context, (String) tVar.f12230c.zzb(zzbctVar), str, str2).toString(), str2);
                if (TextUtils.isEmpty(strJ)) {
                    int i10 = l0.f13401b;
                    rc.k.b("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strJ.trim());
                        String strOptString = jSONObject.optString("gct");
                        nVar2.f13411f = jSONObject.optString("status");
                        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
                            boolean z2 = "0".equals(nVar2.f13411f) || "2".equals(nVar2.f13411f);
                            nVar2.d(z2);
                            ((o0) nVar.f11582h.zzi()).q(!z2 ? "" : str);
                        }
                        synchronized (nVar2.f13406a) {
                            nVar2.f13408c = strOptString;
                        }
                        if ("2".equals(nVar2.f13411f)) {
                            int i11 = l0.f13401b;
                            rc.k.b("Creative is not pushed for this device.");
                            n.e(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(nVar2.f13411f)) {
                            int i12 = l0.f13401b;
                            rc.k.b("The app is not linked for creative preview.");
                            nVar2.b(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(nVar2.f13411f)) {
                                int i13 = l0.f13401b;
                                rc.k.b("Device is linked for in app preview.");
                                n.e(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e10) {
                        int i14 = l0.f13401b;
                        rc.k.h("Fail to get in app preview response json.", e10);
                    }
                }
                n.e(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 3:
                mc.n.D.f11588o.a(this.f13342b.f13383a);
                return;
            case 4:
                k kVar4 = this.f13342b;
                kVar4.c(kVar4.f13383a);
                return;
            case 5:
                mc.n.D.f11588o.a(this.f13342b.f13383a);
                return;
            default:
                k kVar5 = this.f13342b;
                n nVar3 = mc.n.D.f11588o;
                String str3 = kVar5.f13386d;
                String str4 = kVar5.f13387e;
                String str5 = kVar5.f13388f;
                boolean zH = nVar3.h();
                Context context2 = kVar5.f13383a;
                boolean zF = nVar3.f(context2, str3, str4);
                synchronized (nVar3.f13406a) {
                    nVar3.f13409d = zF;
                }
                if (!nVar3.h()) {
                    nVar3.b(context2, str3, str4);
                    return;
                }
                if (!zH && !TextUtils.isEmpty(str5)) {
                    nVar3.c(context2, str4, str5, str3);
                }
                int i15 = l0.f13401b;
                rc.k.b("Device is linked for debug signals.");
                n.e(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
        }
    }
}
