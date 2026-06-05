package gh;

import hh.f;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements eh.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7407a;

    @Override // eh.a
    public final void a(Object obj, Object obj2) {
        switch (this.f7407a) {
            case 0:
                throw new eh.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                eh.e eVar = (eh.e) obj2;
                eVar.a(f.f8002g, entry.getKey());
                eVar.a(f.f8003h, entry.getValue());
                return;
            default:
                throw new eh.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
