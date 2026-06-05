package be;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1748a;

    public b(TaskCompletionSource taskCompletionSource) {
        this.f1748a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        f.g0(status, pendingIntent, this.f1748a);
    }
}
