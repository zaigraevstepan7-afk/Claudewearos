package x3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends g {
    public final /* synthetic */ j A;

    public i(j jVar) {
        this.A = jVar;
    }

    @Override // x3.g
    public final String p() {
        h hVar = (h) this.A.f19831a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f19827a + "]";
    }
}
