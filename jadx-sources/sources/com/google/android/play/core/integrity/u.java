package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f4120a;

    private u() {
        throw null;
    }

    public final u a(Context context) {
        context.getClass();
        this.f4120a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        Context context = this.f4120a;
        if (context != null) {
            return new w(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ u(t tVar) {
    }
}
