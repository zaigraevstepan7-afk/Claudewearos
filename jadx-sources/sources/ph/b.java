package ph;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12971b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f12970a = i10;
        this.f12971b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        qh.a aVarJ;
        qh.a aVarG;
        switch (this.f12970a) {
            case 0:
                this.f12971b.a();
                return;
            case 1:
                this.f12971b.a();
                return;
            default:
                c cVar = this.f12971b;
                Object obj = c.f12972m;
                synchronized (obj) {
                    try {
                        cg.i iVar = cVar.f12973a;
                        iVar.b();
                        mh.g gVarH = mh.g.h(iVar.f3367a);
                        try {
                            aVarJ = cVar.f12975c.J();
                            if (gVarH != null) {
                                gVarH.A();
                            }
                        } catch (Throwable th2) {
                            if (gVarH != null) {
                                gVarH.A();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i10 = aVarJ.f13497b;
                    if (i10 == 5) {
                        aVarG = cVar.g(aVarJ);
                    } else {
                        if (i10 == 3) {
                            aVarG = cVar.g(aVarJ);
                        } else if (!cVar.f12976d.a(aVarJ)) {
                            return;
                        } else {
                            aVarG = cVar.b(aVarJ);
                        }
                    }
                    synchronized (obj) {
                        try {
                            cg.i iVar2 = cVar.f12973a;
                            iVar2.b();
                            mh.g gVarH2 = mh.g.h(iVar2.f3367a);
                            try {
                                cVar.f12975c.E(aVarG);
                                if (gVarH2 != null) {
                                    gVarH2.A();
                                }
                            } catch (Throwable th3) {
                                if (gVarH2 != null) {
                                    gVarH2.A();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.f12982k.size() != 0 && !TextUtils.equals(aVarJ.f13496a, aVarG.f13496a)) {
                                Iterator it = cVar.f12982k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (aVarG.f13497b == 4) {
                        String str = aVarG.f13496a;
                        synchronized (cVar) {
                            cVar.j = str;
                        }
                    }
                    int i11 = aVarG.f13497b;
                    if (i11 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i11 == 2 || i11 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(aVarG);
                        return;
                    }
                } catch (e e10) {
                    cVar.h(e10);
                    return;
                }
        }
    }
}
