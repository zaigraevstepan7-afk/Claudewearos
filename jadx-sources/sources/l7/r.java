package l7;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.e f10069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10070b;

    public r(s sVar, q.e eVar) {
        this.f10070b = sVar;
        this.f10069a = eVar;
    }

    @Override // l7.q, l7.m
    public final void f(p pVar) {
        ((ArrayList) this.f10069a.get(this.f10070b.f10072b)).remove(pVar);
        pVar.z(this);
    }
}
