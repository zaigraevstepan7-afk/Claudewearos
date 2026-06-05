package t7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public final f f16120a = f.f16114c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return this.f16120a.equals(((i) obj).f16120a);
    }

    public final int hashCode() {
        return this.f16120a.hashCode() + (i.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f16120a + '}';
    }
}
