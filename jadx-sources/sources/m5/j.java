package m5;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends vi.i implements ej.c {
    public final /* synthetic */ z A;
    public final /* synthetic */ a8.j B;

    /* renamed from: a, reason: collision with root package name */
    public Object f11317a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f11318b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11319c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11320d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f11321e;

    /* renamed from: f, reason: collision with root package name */
    public int f11322f;

    /* renamed from: z, reason: collision with root package name */
    public int f11323z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, a8.j jVar, ti.c cVar) {
        super(1, cVar);
        this.A = zVar;
        this.B = jVar;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new j(this.A, this.B, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        return ((j) create((ti.c) obj)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
