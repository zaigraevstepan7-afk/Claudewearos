package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fd.b;
import fd.c;
import jd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbo extends m {
    public zzbo(Activity activity, c cVar) {
        super(activity, activity, b.f6726a, cVar == null ? c.f6727b : cVar, l.f3608c);
    }

    public final Task<String> getSpatulaHeader() {
        x xVarA = y.a();
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
            }
        };
        xVarA.f3596b = 1520;
        return doRead(xVarA.a());
    }

    public final Task<jd.b> performProxyRequest(final a aVar) {
        x xVarA = y.a();
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = this.zza;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        xVarA.f3596b = 1518;
        return doWrite(xVarA.a());
    }

    public zzbo(Context context, c cVar) {
        super(context, null, b.f6726a, cVar == null ? c.f6727b : cVar, l.f3608c);
    }
}
