package xc;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzgcx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements zzgcx {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbud f19952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f19954d;

    public /* synthetic */ k(l lVar, zzbud zzbudVar, boolean z2, int i10) {
        this.f19951a = i10;
        this.f19952b = zzbudVar;
        this.f19953c = z2;
        this.f19954d = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        int i10 = this.f19951a;
        zzbud zzbudVar = this.f19952b;
        switch (i10) {
            case 0:
                try {
                    zzbudVar.zze("Internal error: " + th2.getMessage());
                    break;
                } catch (RemoteException e10) {
                    int i11 = qc.l0.f13401b;
                    rc.k.e("", e10);
                    return;
                }
            default:
                try {
                    zzbudVar.zze("Internal error: " + th2.getMessage());
                    break;
                } catch (RemoteException e11) {
                    int i12 = qc.l0.f13401b;
                    rc.k.e("", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        int i10 = this.f19951a;
        boolean z2 = this.f19953c;
        zzbud zzbudVar = this.f19952b;
        l lVar = this.f19954d;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    zzbudVar.zzf(arrayList);
                    boolean z10 = lVar.F;
                    zzfjq zzfjqVar = lVar.E;
                    if (z10 || z2) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            Uri uri = (Uri) obj2;
                            if (l.z(uri, lVar.R, lVar.S)) {
                                zzfjqVar.zzd(l.B(uri, lVar.O, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhD)).booleanValue()) {
                                    zzfjqVar.zzd(uri.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e10) {
                    int i12 = qc.l0.f13401b;
                    rc.k.e("", e10);
                    return;
                }
            default:
                List<Uri> list = (List) obj;
                try {
                    ArrayList arrayList2 = lVar.Q;
                    ArrayList arrayList3 = lVar.P;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (l.z((Uri) it.next(), arrayList3, arrayList2)) {
                                lVar.L.getAndIncrement();
                            }
                        }
                    }
                    zzbudVar.zzf(list);
                    boolean z11 = lVar.G;
                    zzfjq zzfjqVar2 = lVar.E;
                    if (z11 || z2) {
                        for (Uri uri2 : list) {
                            if (l.z(uri2, arrayList3, arrayList2)) {
                                zzfjqVar2.zzd(l.B(uri2, lVar.O, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzhD)).booleanValue()) {
                                    zzfjqVar2.zzd(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e11) {
                    int i13 = qc.l0.f13401b;
                    rc.k.e("", e11);
                }
        }
    }
}
