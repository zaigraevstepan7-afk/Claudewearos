package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f4078c;

    /* renamed from: d, reason: collision with root package name */
    private final h0 f4079d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.f4078c = bnVar;
        this.f4079d = new h0("OnRequestIntegrityTokenCallback");
        this.f4080e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, kf.z
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f4079d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f4078c.f4089f.a(bundle);
        if (jVarA != null) {
            this.f4075a.trySetException(jVarA);
            return;
        }
        bj bjVar = new bj(this, this.f4078c.f4086c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f4075a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
