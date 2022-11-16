import okio.FileSystem

actual val HostFileSystem: FileSystem
    get() = FileSystem.SYSTEM