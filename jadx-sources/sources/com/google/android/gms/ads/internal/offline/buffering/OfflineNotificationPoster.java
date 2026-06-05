package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbth;
import nc.f;
import nc.p;
import nc.s;
import oc.a;
import t7.i;
import t7.k;
import t7.l;
import xd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: z, reason: collision with root package name */
    public final zzbth f3439z;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        p pVar = s.f12202f.f12204b;
        zzbpk zzbpkVar = new zzbpk();
        pVar.getClass();
        this.f3439z = (zzbth) new f(context, zzbpkVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final l doWork() {
        try {
            this.f3439z.zzj(new b(getApplicationContext()), new a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return new k(t7.f.f16114c);
        } catch (RemoteException unused) {
            return new i();
        }
    }
}
