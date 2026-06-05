package v3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import f1.g0;
import v2.r1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f17850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f17851c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.e f17852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f17854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, ej.c cVar, g0 g0Var, s1.e eVar, int i10, View view) {
        super(0);
        this.f17849a = context;
        this.f17850b = cVar;
        this.f17851c = g0Var;
        this.f17852d = eVar;
        this.f17853e = i10;
        this.f17854f = view;
    }

    @Override // ej.a
    public final Object a() {
        KeyEvent.Callback callback = this.f17854f;
        fj.l.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new w(this.f17849a, this.f17850b, this.f17851c, this.f17852d, this.f17853e, (r1) callback).getLayoutNode();
    }
}
