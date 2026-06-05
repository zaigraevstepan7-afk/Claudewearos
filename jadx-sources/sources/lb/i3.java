package lb;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i3 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f10362c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f10363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f10364e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context, List list, float f10, float f11, s sVar, ti.c cVar) {
        super(2, cVar);
        this.f10360a = context;
        this.f10361b = list;
        this.f10362c = f10;
        this.f10363d = f11;
        this.f10364e = sVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new i3(this.f10360a, this.f10361b, this.f10362c, this.f10363d, this.f10364e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i3) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        return q3.P(this.f10360a, this.f10361b, this.f10362c, this.f10363d, this.f10364e);
    }
}
