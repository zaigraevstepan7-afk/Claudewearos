package nb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f12053a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f12054b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f12055c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f12056d;

    static {
        q qVar = new q("Monthly", 0);
        f12053a = qVar;
        q qVar2 = new q("Yearly", 1);
        f12054b = qVar2;
        q qVar3 = new q("DevTest", 2);
        f12055c = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        f12056d = qVarArr;
        u0.c.j(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f12056d.clone();
    }
}
