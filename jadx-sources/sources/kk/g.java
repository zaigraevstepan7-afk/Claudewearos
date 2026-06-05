package kk;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public interface g extends b0, WritableByteChannel {
    g G(String str);

    g L(long j);

    @Override // kk.b0, java.io.Flushable
    void flush();

    g write(byte[] bArr);

    g writeByte(int i10);

    g writeInt(int i10);

    g writeShort(int i10);
}
