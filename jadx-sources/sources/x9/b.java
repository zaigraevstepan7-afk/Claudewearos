package x9;

import a2.f0;
import ac.f;
import ag.l;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import c.e0;
import f0.a1;
import f7.d;
import f7.e;
import g7.g;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import k3.w;
import nb.o;
import r6.c;
import rg.d0;
import tj.r0;
import ug.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements l, dc.a, d, w, mg.l, c, i, wb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19848a;

    public /* synthetic */ b(int i10) {
        this.f19848a = i10;
    }

    public static e0 f(int i10, int i11) {
        return new e0(i10, i11, 0, new ab.d(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(t5.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.b.i(t5.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // dc.a
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // mg.l
    public void c(mg.b bVar) {
        fj.l.f(bVar, "error");
        Log.e("ProManager", "shutdown_message read failed: " + bVar.f11672b);
        r0 r0Var = o.f12038n;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.k(null, bool);
    }

    @Override // f7.d
    public e e(a1 a1Var) {
        return new g((Context) a1Var.f6105b, (String) a1Var.f6106c, (f7.c) a1Var.f6107d, a1Var.f6104a);
    }

    @Override // oi.a
    public Object get() {
        switch (this.f19848a) {
            case 13:
                return new f8.b(Executors.newSingleThreadExecutor(), 1);
            default:
                y9.a aVar = new y9.a();
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(rb.d.f14317a, new ac.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(rb.d.f14319c, new ac.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(f.f380b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(rb.d.f14318b, new ac.c(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < rb.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new ac.b(aVar, map);
        }
    }

    @Override // ug.i
    public boolean h(Object obj) {
        switch (this.f19848a) {
            case 11:
                ((d0) obj).getClass();
                break;
        }
        return true;
    }

    @Override // mg.l
    public void n(mg.a aVar) {
        String str = (String) aVar.c(String.class);
        if (str != null && !nj.e.K0(str)) {
            r0 r0Var = o.f12040p;
            r0Var.getClass();
            r0Var.k(null, str);
        }
        r0 r0Var2 = o.f12038n;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.k(null, bool);
    }

    public b(f0 f0Var) {
        this.f19848a = 16;
    }

    @Override // r6.c
    public void d() {
    }

    @Override // r6.c
    public void g(int i10, Object obj) {
    }
}
