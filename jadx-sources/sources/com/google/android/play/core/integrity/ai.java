package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.d0;
import kf.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class ai extends d0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f4019a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f4020b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f4021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f4019a = ajVar;
        this.f4020b = new h0("OnRequestIntegrityTokenCallback");
        this.f4021c = taskCompletionSource;
    }

    @Override // kf.e0
    public final void b(Bundle bundle) {
        this.f4019a.f4022a.d(this.f4021c);
        this.f4020b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f4019a.f4027f.a(bundle);
        if (jVarA != null) {
            this.f4021c.trySetException(jVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f4021c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f4019a.f4024c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f4021c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
