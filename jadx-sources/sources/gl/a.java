package gl;

import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import d6.c;
import fj.f;
import fj.w;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends yk.a {

    /* renamed from: c, reason: collision with root package name */
    public final c f7552c;

    public a(c cVar) {
        super(new ArrayList(), 2);
        this.f7552c = cVar;
    }

    @Override // yk.a
    public final Object a(f fVar) {
        return fVar.equals(w.a(o0.class)) ? r0.c(this.f7552c) : super.a(fVar);
    }
}
