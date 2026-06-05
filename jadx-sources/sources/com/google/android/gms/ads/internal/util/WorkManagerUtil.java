package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import c8.i;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import ef.f;
import java.util.HashMap;
import java.util.HashSet;
import p1.l;
import qc.a0;
import t7.c;
import t7.e;
import u7.k;
import xd.a;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzays implements a0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            a aVarN = b.n(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzayt.zzc(parcel);
            boolean zZzf = zzf(aVarN, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i10 == 2) {
            a aVarN2 = b.n(parcel.readStrongBinder());
            zzayt.zzc(parcel);
            zze(aVarN2);
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            a aVarN3 = b.n(parcel.readStrongBinder());
            oc.a aVar = (oc.a) zzayt.zza(parcel, oc.a.CREATOR);
            zzayt.zzc(parcel);
            boolean zZzg = zzg(aVarN3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }

    @Override // qc.a0
    public final void zze(a aVar) {
        Context context = (Context) b.u(aVar);
        try {
            k.q0(context.getApplicationContext(), new t7.b(new f()));
        } catch (IllegalStateException unused) {
        }
        try {
            k kVarP0 = k.p0(context);
            kVarP0.f16843e.f(new d8.b(kVarP0, 0));
            e eVar = new e();
            c cVar = new c();
            cVar.f16102a = 1;
            cVar.f16107f = -1L;
            cVar.f16108g = -1L;
            new HashSet();
            cVar.f16103b = false;
            cVar.f16104c = false;
            cVar.f16102a = 2;
            cVar.f16105d = false;
            cVar.f16106e = false;
            cVar.f16109h = eVar;
            cVar.f16107f = -1L;
            cVar.f16108g = -1L;
            l lVar = new l(OfflinePingSender.class);
            ((i) lVar.f12661c).j = cVar;
            ((HashSet) lVar.f12662d).add("offline_ping_sender_work");
            kVarP0.E(lVar.e());
        } catch (IllegalStateException e10) {
            rc.k.h("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // qc.a0
    public final boolean zzf(a aVar, String str, String str2) {
        return zzg(aVar, new oc.a(str, str2, ""));
    }

    @Override // qc.a0
    public final boolean zzg(a aVar, oc.a aVar2) throws Throwable {
        Context context = (Context) b.u(aVar);
        try {
            k.q0(context.getApplicationContext(), new t7.b(new f()));
        } catch (IllegalStateException unused) {
        }
        e eVar = new e();
        c cVar = new c();
        cVar.f16102a = 1;
        cVar.f16107f = -1L;
        cVar.f16108g = -1L;
        new HashSet();
        cVar.f16103b = false;
        cVar.f16104c = false;
        cVar.f16102a = 2;
        cVar.f16105d = false;
        cVar.f16106e = false;
        cVar.f16109h = eVar;
        cVar.f16107f = -1L;
        cVar.f16108g = -1L;
        HashMap map = new HashMap();
        map.put("uri", aVar2.f12444a);
        map.put("gws_query_id", aVar2.f12445b);
        map.put("image_url", aVar2.f12446c);
        t7.f fVar = new t7.f(map);
        t7.f.c(fVar);
        l lVar = new l(OfflineNotificationPoster.class);
        i iVar = (i) lVar.f12661c;
        iVar.j = cVar;
        iVar.f3125e = fVar;
        ((HashSet) lVar.f12662d).add("offline_notification_work");
        try {
            k.p0(context).E(lVar.e());
            return true;
        } catch (IllegalStateException e10) {
            rc.k.h("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
