package p7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends b {
    @Override // p7.c
    public final boolean b() {
        if (!super.b() || !mk.b.w("MULTI_PROCESS")) {
            return false;
        }
        int i10 = o7.e.f12424a;
        if (n.f12816b.b()) {
            return o.f12820a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
