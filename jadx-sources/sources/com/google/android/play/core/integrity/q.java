package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class q implements x {

    /* renamed from: a, reason: collision with root package name */
    private Context f4114a;

    private q() {
        throw null;
    }

    public final q a(Context context) {
        context.getClass();
        this.f4114a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        Context context = this.f4114a;
        if (context != null) {
            return new s(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ q(p pVar) {
    }
}
