package w8;

import ak.x;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import qc.l0;
import w5.a0;
import xc.g0;
import xc.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18963d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.f18960a = i10;
        this.f18961b = obj;
        this.f18962c = obj2;
        this.f18963d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        x xVar;
        zzan zzanVar;
        zzan zzanVar2;
        zzfcs zzfcsVar;
        int i10 = 119;
        Exception exc = null;
        switch (this.f18960a) {
            case 0:
                a aVar = (a) this.f18961b;
                a0 a0Var = (a0) this.f18962c;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                ((i) ((zzco) a0Var.f18604a).get(0)).getClass();
                zzco zzcoVar = (zzco) a0Var.f18604a;
                int size = zzcoVar.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        xVar = new x(0, "", arrayList);
                    } else {
                        int i13 = i12 + 20;
                        ArrayList arrayList2 = new ArrayList(zzcoVar.subList(i12, i13 > size ? size : i13));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i14 = i11; i14 < size2; i14++) {
                            ((i) arrayList2.get(i14)).getClass();
                            arrayList3.add("void_launcher_pro");
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", aVar.f18918c);
                        try {
                            synchronized (aVar.f18916a) {
                                zzanVar = aVar.f18923h;
                            }
                            if (zzanVar == null) {
                                xVar = aVar.p(u.j, i10, "Service has been reset to null.", exc);
                            } else {
                                int i15 = true != aVar.f18933s ? 17 : 20;
                                String packageName = aVar.f18921f.getPackageName();
                                if (aVar.f18932r) {
                                    aVar.f18935u.getClass();
                                }
                                String str = aVar.f18918c;
                                aVar.i();
                                aVar.i();
                                aVar.i();
                                aVar.i();
                                a aVar2 = aVar;
                                try {
                                    long jLongValue = aVar.f18939y.longValue();
                                    Bundle bundle2 = new Bundle();
                                    zze.zzc(bundle2, str, jLongValue);
                                    bundle2.putBoolean("enablePendingPurchases", true);
                                    bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                    ArrayList<String> arrayList4 = new ArrayList<>();
                                    ArrayList<String> arrayList5 = new ArrayList<>();
                                    int size3 = arrayList2.size();
                                    int i16 = 0;
                                    boolean z2 = false;
                                    while (i16 < size3) {
                                        i iVar = (i) arrayList2.get(i16);
                                        arrayList4.add(null);
                                        z2 |= !TextUtils.isEmpty(null);
                                        iVar.getClass();
                                        i16++;
                                        packageName = packageName;
                                    }
                                    String str2 = packageName;
                                    if (z2) {
                                        bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                    }
                                    Bundle bundleZzl = zzanVar.zzl(i15, str2, "subs", bundle, bundle2);
                                    if (bundleZzl == null) {
                                        xVar = aVar2.p(u.f18992p, 44, "queryProductDetailsAsync got empty product details response.", null);
                                    } else {
                                        aVar = aVar2;
                                        if (bundleZzl.containsKey("DETAILS_LIST")) {
                                            ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList != null) {
                                                for (int i17 = 0; i17 < stringArrayList.size(); i17++) {
                                                    try {
                                                        g gVar = new g(stringArrayList.get(i17));
                                                        zze.zzk("BillingClient", "Got product details: ".concat(gVar.toString()));
                                                        arrayList.add(gVar);
                                                    } catch (JSONException e10) {
                                                        xVar = aVar.p(u.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                                    }
                                                }
                                                i12 = i13;
                                                i10 = 119;
                                                exc = null;
                                                i11 = 0;
                                            } else {
                                                xVar = aVar.p(u.f18992p, 46, "queryProductDetailsAsync got null response list", null);
                                            }
                                        } else {
                                            int iZzb = zze.zzb(bundleZzl, "BillingClient");
                                            String strZzh = zze.zzh(bundleZzl, "BillingClient");
                                            xVar = iZzb != 0 ? aVar.p(u.a(iZzb, strZzh), 23, m6.a.d(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : aVar.p(u.a(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                        }
                                    }
                                } catch (DeadObjectException e11) {
                                    e = e11;
                                    aVar = aVar2;
                                    xVar = aVar.p(u.j, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                    ((ac.l) this.f18963d).d(u.a(xVar.f742b, (String) xVar.f744d), (ArrayList) xVar.f743c);
                                    return null;
                                } catch (Exception e12) {
                                    e = e12;
                                    aVar = aVar2;
                                    xVar = aVar.p(u.f18985h, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                    ((ac.l) this.f18963d).d(u.a(xVar.f742b, (String) xVar.f744d), (ArrayList) xVar.f743c);
                                    return null;
                                }
                            }
                        } catch (DeadObjectException e13) {
                            e = e13;
                        } catch (Exception e14) {
                            e = e14;
                        }
                    }
                }
                ((ac.l) this.f18963d).d(u.a(xVar.f742b, (String) xVar.f744d), (ArrayList) xVar.f743c);
                return null;
            case 1:
                a aVar3 = (a) this.f18961b;
                String str3 = (String) this.f18962c;
                String str4 = (String) this.f18963d;
                try {
                    synchronized (aVar3.f18916a) {
                        zzanVar2 = aVar3.f18923h;
                    }
                    return zzanVar2 == null ? zze.zzn(u.j, 119) : zzanVar2.zzf(3, aVar3.f18921f.getPackageName(), str3, str4, null);
                } catch (DeadObjectException e15) {
                    return zze.zzo(u.j, 5, s.a(e15));
                } catch (Exception e16) {
                    return zze.zzo(u.f18985h, 5, s.a(e16));
                }
            case 2:
                xc.l lVar = (xc.l) this.f18961b;
                Uri uriZza = (Uri) this.f18962c;
                xd.a aVar4 = (xd.a) this.f18963d;
                try {
                    uriZza = (!((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzmk)).booleanValue() || (zzfcsVar = lVar.f19964d) == null) ? lVar.f19963c.zza(uriZza, lVar.f19962b, (View) xd.b.u(aVar4), null) : zzfcsVar.zza(uriZza, lVar.f19962b, (View) xd.b.u(aVar4), null);
                } catch (zzavt e17) {
                    int i18 = l0.f13401b;
                    rc.k.h("", e17);
                }
                if (uriZza.getQueryParameter("ms") != null) {
                    return uriZza;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 3:
                xc.l lVar2 = (xc.l) this.f18961b;
                List<Uri> list = (List) this.f18962c;
                xd.a aVar5 = (xd.a) this.f18963d;
                zzavs zzavsVar = lVar2.f19963c;
                String strZzh2 = zzavsVar.zzc() != null ? zzavsVar.zzc().zzh(lVar2.f19962b, (View) xd.b.u(aVar5), null) : "";
                if (TextUtils.isEmpty(strZzh2)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList6 = new ArrayList();
                for (Uri uri : list) {
                    if (xc.l.z(uri, lVar2.R, lVar2.S)) {
                        arrayList6.add(xc.l.B(uri, "ms", strZzh2));
                    } else {
                        String strValueOf = String.valueOf(uri);
                        int i19 = l0.f13401b;
                        rc.k.g("Not a Google URL: ".concat(strValueOf));
                        arrayList6.add(uri);
                    }
                }
                if (arrayList6.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList6;
            default:
                zc.a.a(((g0) this.f18961b).f19934c, (fc.g) this.f18962c, (h0) this.f18963d);
                return Boolean.TRUE;
        }
    }
}
