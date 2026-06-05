package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface q1 {
    boolean a();

    long b(p pVar, p pVar2, p pVar3);

    p d(long j, p pVar, p pVar2, p pVar3);

    default p j(p pVar, p pVar2, p pVar3) {
        return k(b(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }

    p k(long j, p pVar, p pVar2, p pVar3);
}
