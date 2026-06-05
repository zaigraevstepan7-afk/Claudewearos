package p1;

import f1.q1;
import f1.u2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends m1.e {

    /* renamed from: z, reason: collision with root package name */
    public i f12645z;

    @Override // m1.e, k1.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i build() {
        m1.m mVar = this.f11233c;
        i iVar = this.f12645z;
        if (mVar != iVar.f11226a) {
            this.f11232b = new o1.b();
            iVar = new i(this.f11233c, this.f11236f);
        }
        this.f12645z = iVar;
        return iVar;
    }

    @Override // m1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof q1) {
            return super.containsKey((q1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof u2) {
            return super.containsValue((u2) obj);
        }
        return false;
    }

    @Override // m1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof q1) {
            return (u2) super.get((q1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof q1) ? obj2 : (u2) super.getOrDefault((q1) obj, (u2) obj2);
    }

    @Override // m1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof q1) {
            return (u2) super.remove((q1) obj);
        }
        return null;
    }
}
