package com.google.android.gms.internal.appset;

import android.content.Context;
import cd.a;
import cd.b;
import cd.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import nd.d;
import nd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzp extends m implements a {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;
    private final Context zzd;
    private final f zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, hVar);
    }

    public zzp(Context context, f fVar) {
        super(context, null, zzc, e.j, l.f3608c);
        this.zzd = context;
        this.zze = fVar;
    }

    @Override // cd.a
    public final Task<b> getAppSetIdInfo() {
        if (this.zze.d(this.zzd, 212800000) != 0) {
            return Tasks.forException(new j(new Status(17, null, null, null)));
        }
        x xVarA = y.a();
        xVarA.f3599e = new d[]{cd.e.f3225a};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new c(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 27601;
        return doRead(xVarA.a());
    }
}
